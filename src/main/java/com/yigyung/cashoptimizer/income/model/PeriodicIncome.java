package com.yigyung.cashoptimizer.income.model;

import com.yigyung.cashoptimizer.common.model.Periodic;

import java.time.LocalDateTime;

public class PeriodicIncome extends Income implements Periodic {
    private LocalDateTime getPayDate;
}