package com.yigyung.cashoptimizer.spending.model;

import com.yigyung.cashoptimizer.common.model.Periodic;

import java.time.LocalDateTime;

public class PeriodicSpending extends Spending implements Periodic {
    private LocalDateTime getRequiredBeginDate;
    private LocalDateTime getRequiredEndDate;
    private LocalDateTime getPaymentDate;
}