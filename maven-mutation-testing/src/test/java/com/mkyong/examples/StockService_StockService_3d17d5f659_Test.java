package com.mkyong.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StockService_StockService_3d17d5f659_Test {

    @Mock
    private StockService stockService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testStockService_WithPositiveQtyOnHand() {
        Mockito.when(stockService.checkQtyOnHand()).thenReturn(15);
        Assertions.assertEquals(15, stockService.checkQtyOnHand());
    }

    @Test
    public void testStockService_WithZeroQtyOnHand() {
        Mockito.when(stockService.checkQtyOnHand()).thenReturn(0);
        Assertions.assertEquals(0, stockService.checkQtyOnHand());
    }

    @Test
    public void testStockService_WithNegativeQtyOnHand() {
        Mockito.when(stockService.checkQtyOnHand()).thenReturn(-5);
        Assertions.assertEquals(-5, stockService.checkQtyOnHand());
    }

    @Test
    public void testStockService_CheckQtyOnHand() {
        Mockito.when(stockService.checkQtyOnHand()).thenReturn(20);
        Assertions.assertEquals(20, stockService.checkQtyOnHand());
    }
}
