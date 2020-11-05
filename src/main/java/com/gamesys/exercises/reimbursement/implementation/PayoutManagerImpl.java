package com.gamesys.exercises.reimbursement.implementation;

import com.gamesys.exercises.reimbursement.interfaces.PayoutManager;
import com.gamesys.exercises.reimbursement.objects.PayoutRequest;
import com.gamesys.exercises.reimbursement.objects.PayoutResult;

public class PayoutManagerImpl implements PayoutManager {
    @Override
    public PayoutResult payoutEmployee(PayoutRequest request) {
        PayoutResult payoutResult = new PayoutResult();
        payoutResult.setEmployeeId(request.getEmployeeId());
        payoutResult.setAmount(request.getAmount());
        return payoutResult;
    }
}
