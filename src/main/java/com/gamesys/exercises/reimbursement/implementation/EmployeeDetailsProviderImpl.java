package com.gamesys.exercises.reimbursement.implementation;

import com.gamesys.exercises.reimbursement.objects.EmployeeDetails;
import com.gamesys.exercises.reimbursement.interfaces.EmployeeDetailsProvider;

public class EmployeeDetailsProviderImpl implements EmployeeDetailsProvider {
    @Override
    public EmployeeDetails getEmployeeDetails(Long employeeId) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setEmployeeId(employeeId);
        employeeDetails.setEmployeeStatus(1);
        return employeeDetails;
    }
}
