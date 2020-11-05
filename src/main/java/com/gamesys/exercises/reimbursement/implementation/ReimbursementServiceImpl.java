package com.gamesys.exercises.reimbursement.implementation;

import com.gamesys.exercises.reimbursement.interfaces.EmployeeDetailsProvider;
import com.gamesys.exercises.reimbursement.interfaces.PayoutManager;
import com.gamesys.exercises.reimbursement.interfaces.ReimbursableProvider;
import com.gamesys.exercises.reimbursement.interfaces.ReimbursementService;
import com.gamesys.exercises.reimbursement.objects.PayoutRequest;
import com.gamesys.exercises.reimbursement.objects.ReimbursementRequest;
import com.gamesys.exercises.reimbursement.objects.ReimbursementResult;

public class ReimbursementServiceImpl implements ReimbursementService {

    private ReimbursableProvider reimbursableProvider;
    private PayoutManager payoutManager;
    private EmployeeDetailsProvider employeeDetailsProvider;

    public ReimbursementServiceImpl(
            EmployeeDetailsProvider employeeDetailsProvider,
            ReimbursableProvider reimbursableProvider,
            PayoutManager payoutManager) {
        this.employeeDetailsProvider = employeeDetailsProvider;
        this.reimbursableProvider = reimbursableProvider;
        this.payoutManager = payoutManager;
    }

    @Override
    public ReimbursementResult reimburse(ReimbursementRequest request) {
        ReimbursementResult reimbursementResult = new ReimbursementResult();
        PayoutRequest payoutRequest = new PayoutRequest();
        reimbursementResult.setApproved(false);
        if (employeeDetailsProvider.getEmployeeDetails(request.getEmployeeId()).getEmployeeStatus() == 1) {
            if (request.getPurchaseAmount() > reimbursableProvider
                    .getReimbursable(request.getReimbursableId())
                    .getAmount()) {
                reimbursementResult.setApprovedAmount(reimbursableProvider
                        .getReimbursable(request.getReimbursableId())
                        .getAmount());
                System.out.println("From Reimbursement");
            } else {
                payoutRequest.setEmployeeId(request.getEmployeeId());
                payoutRequest.setAmount(request.getPurchaseAmount());
                reimbursementResult.setApprovedAmount(payoutManager
                        .payoutEmployee(payoutRequest).getAmount());
                System.out.println("From Payout");
            }
            reimbursementResult.setApproved(true);
        } else {
            System.out.println("No Payout");
        }
        return reimbursementResult;
    }
}
