package com.gamesys.exercises.reimbursement;

public class ReimbursementServiceImpl implements ReimbursementService {

    @Override
    public ReimbursementResult reimburse() {
        ReimbursementResult reimbursementResult = new ReimbursementResult();
        reimbursementResult.setAmount(100);
        reimbursementResult.setApproved(true);
        return reimbursementResult;
    }
}
