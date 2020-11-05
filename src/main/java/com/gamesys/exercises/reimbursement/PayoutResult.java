package com.gamesys.exercises.reimbursement;

public class PayoutResult {
    private Long employeeId;
    private Double amount;
    private Integer payoutStatus;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getPayoutStatus() {
        return payoutStatus;
    }

    public void setPayoutStatus(Integer payoutStatus) {
        this.payoutStatus = payoutStatus;
    }
}
