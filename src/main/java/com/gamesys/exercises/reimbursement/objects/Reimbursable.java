package com.gamesys.exercises.reimbursement.objects;

public class Reimbursable {
    private Long reimbursableId;
    private Double amount;
    private String name;

    public Long getReimbursableId() {
        return reimbursableId;
    }

    public void setReimbursableId(Long reimbursableId) {
        this.reimbursableId = reimbursableId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
