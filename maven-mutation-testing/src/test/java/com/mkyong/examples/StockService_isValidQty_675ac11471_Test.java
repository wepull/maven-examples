package com.mkyong.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StockService_isValidQty_675ac11471_Test {

    @Autowired
    private StockService stockService;

    @Test
    public void testIsValidQtyPositive() {
        int qty = 5;
        try {
            stockService.isValidQty(qty);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Quality should be positive!");
        }
    }

    @Test
    public void testIsValidQtyZero() {
        int qty = 0;
        try {
            stockService.isValidQty(qty);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Quality should not be less than zero!");
        }
    }

    @Test
    public void testIsValidQtyNegative() {
        int qty = -5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            stockService.isValidQty(qty);
        }, "Quality should not be less than zero!");
    }

    @Test
    public void testIsValidQtyLargePositive() {
        int qty = 10000;
        try {
            stockService.isValidQty(qty);
        } catch (IllegalArgumentException e) {
            Assertions.fail("Quality should not be less than zero!");
        }
    }
}
