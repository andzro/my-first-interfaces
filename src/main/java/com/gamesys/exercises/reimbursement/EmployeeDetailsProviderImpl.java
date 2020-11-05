package com.gamesys.exercises.reimbursement;

public class EmployeeDetailsProviderImpl implements EmployeeDetailsProvider {
    @Override
    public EmployeeDetails getEmployeeDetails(Long employeeId) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmployeeId(employeeId);
        employeeDetails.setEmployeeStatus(1);
        return employeeDetails;
    }
}
