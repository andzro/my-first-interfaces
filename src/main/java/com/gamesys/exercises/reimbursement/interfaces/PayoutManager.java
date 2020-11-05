package com.gamesys.exercises.reimbursement.interfaces;

import com.gamesys.exercises.reimbursement.objects.PayoutRequest;
import com.gamesys.exercises.reimbursement.objects.PayoutResult;

public interface PayoutManager {
    PayoutResult payoutEmployee(PayoutRequest request);
}
