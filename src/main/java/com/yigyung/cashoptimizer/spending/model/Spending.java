package com.yigyung.cashoptimizer.spending.model;

import com.yigyung.cashoptimizer.common.model.CashEvent;

public class Spending extends CashEvent {
    private boolean isIncome = false;
    private boolean isPeriodic = false;
    private int cost;
    private GainType gainType;
    private String gain;
}