package com.gamesys.exercises.reimbursement;

public class ReimbursementResult {
    private boolean approved;
    private double approvedAmount;

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public double getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(double amount) {
        this.approvedAmount = amount;
    }
}
