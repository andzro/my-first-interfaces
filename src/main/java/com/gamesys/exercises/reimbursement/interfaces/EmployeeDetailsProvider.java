package com.gamesys.exercises.reimbursement.interfaces;

import com.gamesys.exercises.reimbursement.objects.EmployeeDetails;

public interface EmployeeDetailsProvider {
    EmployeeDetails getEmployeeDetails(Long employeeId);
}
