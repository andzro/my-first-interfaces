package com.gamesys.exercises.reimbursement;

public class PayoutManagerImpl implements PayoutManager {
    @Override
    public PayoutResult payoutEmployee(PayoutRequest request) {
        PayoutResult payoutResult = new PayoutResult();
        payoutResult.setEmployeeId(request.getEmployeeId());
        payoutResult.setAmount(request.getAmount());
        return payoutResult;
    }
}
