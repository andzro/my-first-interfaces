package com.gamesys.exercises.reimbursement;

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
