package com.gamesys.exercises.reimbursement;

import com.gamesys.exercises.reimbursement.implementation.EmployeeDetailsProviderImpl;
import com.gamesys.exercises.reimbursement.implementation.PayoutManagerImpl;
import com.gamesys.exercises.reimbursement.implementation.ReimbursableProviderImpl;
import com.gamesys.exercises.reimbursement.implementation.ReimbursementServiceImpl;
import com.gamesys.exercises.reimbursement.interfaces.ReimbursementService;
import com.gamesys.exercises.reimbursement.objects.ReimbursementRequest;
import com.gamesys.exercises.reimbursement.objects.ReimbursementResult;

public class ReimbursementMain {
    public static void main(String[] args) {
        ReimbursementService reimbursementService = new ReimbursementServiceImpl(
                new EmployeeDetailsProviderImpl(),
                new ReimbursableProviderImpl(),
                new PayoutManagerImpl()
        );

        ReimbursementRequest request = new ReimbursementRequest();
        request.setEmployeeId(1L);
        request.setPurchaseAmount(11000.0);
        request.setReimbursableId(1L);
        ReimbursementResult result = reimbursementService.reimburse(request);

        System.out.println("Approved: " + result.isApproved());
        System.out.println("Approved Amount: " + result.getApprovedAmount());
    }
}
