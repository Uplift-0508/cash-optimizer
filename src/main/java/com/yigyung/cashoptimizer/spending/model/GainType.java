package com.yigyung.cashoptimizer.spending.model;

public enum GainType {
    BOOKS("도서"),
    PRESENT("선물"),
    MEETING("사교"),
    DAILY_NECESSITY("생필품"),
    MAKE_UP("색조 화장품"),
    BASIC_COSMETICS("기초 화장품"),
    CLOTHES("옷"),
    SHOES("신발"),
    ACCESSORIES("악세서리"),
    IT_DEVICE("IT 기기"),
    EAT_OUT("외식"),
    GROCERIES("식료품"),
    CAFE_FEE("카페 비용"),
    FURNITURE("가구"),
    MEDICAL_CARE("병원 치료"),
    ART_APPRECIATION("예술 감상"),
    ;

    private String gainName;

    private GainType(String gainName) {
        this.gainName = gainName;
    }
}
