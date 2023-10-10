package com.yigyung.cashoptimizer.spending.model;

public enum PeriodicChargeType {
    ADMINISTRATION_COST("관리비") {
        public void test() {

        }
    },
    CELL_PHONE_BILL("핸드폰 요금"),
    INTERNET_EXPENSES("인터넷 비용"),
    TRANSPORTATION_FEE("교통비"),
    HOUSE_RENT("집세")
    ;

    private String name;

    PeriodicChargeType(String name) {
        this.name = name;
    }
}
