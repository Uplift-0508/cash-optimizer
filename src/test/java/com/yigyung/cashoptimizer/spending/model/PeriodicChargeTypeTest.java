package com.yigyung.cashoptimizer.spending.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeriodicChargeTypeTest {
    @Test
    public void test() {
        String name = PeriodicChargeType.ADMINISTRATION_COST.name();
        assertEquals(name, "관리비");
    }
}