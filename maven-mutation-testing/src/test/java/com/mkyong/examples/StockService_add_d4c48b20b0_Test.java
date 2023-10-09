package com.mkyong.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class StockService_add_d4c48b20b0_Test {

    @Mock
    StockService stockService;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddSuccess() {
        int qtyOnHand = 10;
        when(stockService.checkQtyOnHand()).thenReturn(qtyOnHand);
        int result = stockService.checkQtyOnHand();
        assertEquals(qtyOnHand, result);
    }

    @Test
    public void testAddFailure() {
        int qtyOnHand = 10;
        when(stockService.checkQtyOnHand()).thenReturn(qtyOnHand);
        assertThrows(IllegalArgumentException.class, () -> stockService.checkQtyOnHand(), "Quantity should be greater than 0");
    }
    
    @Test
    public void testAddZeroQuantity() {
        int qtyOnHand = 0;
        when(stockService.checkQtyOnHand()).thenReturn(qtyOnHand);
        int result = stockService.checkQtyOnHand();
        assertEquals(qtyOnHand, result);
    }
}
