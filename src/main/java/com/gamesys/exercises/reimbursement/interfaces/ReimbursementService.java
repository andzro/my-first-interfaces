package com.gamesys.exercises.reimbursement.interfaces;

import com.gamesys.exercises.reimbursement.objects.ReimbursementRequest;
import com.gamesys.exercises.reimbursement.objects.ReimbursementResult;

public interface ReimbursementService {
    ReimbursementResult reimburse(ReimbursementRequest request);
}
