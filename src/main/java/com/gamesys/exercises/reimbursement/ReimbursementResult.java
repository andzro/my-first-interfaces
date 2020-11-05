package com.gamesys.exercises.reimbursement;

public class ReimbursementResult {
    private boolean approved;
    private float amount;

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
