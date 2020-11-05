package com.gamesys.exercises.reimbursement.interfaces;

import com.gamesys.exercises.reimbursement.objects.Reimbursable;

public interface ReimbursableProvider {
    Reimbursable getReimbursable(Long reimbursableId);
}
