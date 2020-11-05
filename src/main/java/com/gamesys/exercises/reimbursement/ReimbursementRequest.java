package com.gamesys.exercises.reimbursement;

public class ReimbursementRequest {
    private Long reimbursableId;
    private Double purchaseAmount;
    private Long employeeId;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Long getReimbursableId() {
        return reimbursableId;
    }

    public void setReimbursableId(Long reimbursableId) {
        this.reimbursableId = reimbursableId;
    }
}
