package com.gamesys.exercises.reimbursement;

public class ReimbursableProviderImpl implements ReimbursableProvider {
    @Override
    public Reimbursable getReimbursable(Long reimbursableId) {
        Reimbursable reimbursable = new Reimbursable();
        reimbursable.setReimbursableId(reimbursableId);
        reimbursable.setAmount(10000.0);
        return reimbursable;
    }
}
