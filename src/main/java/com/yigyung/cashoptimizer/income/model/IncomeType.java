package com.yigyung.cashoptimizer.income.model;

public enum IncomeType {
    MONTHLY_PAY("월급"),
    STOCK("주식"),
    STOCK_DIVIDENDS("주식 배당금"),
    PART_TIME("아르바이트 급여"),
    YOUTUBE_PROFITS("유투버 수익"),
    ;

    private String name;

    private IncomeType(String name) {
        this.name = name;
    }
}
