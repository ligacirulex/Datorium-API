package com.datorium.Datorium.API;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MathServiceTest {

    MathService mathService = new MathService();

    @Test
    void testSum() {
        assertEquals(50, mathService.sum(20, 30));  // 20 + 30 = 50
        assertEquals(0, mathService.sum(60, 50));   // 60 + 50 = 110, should return 0
        assertEquals(100, mathService.sum(50, 50)); // 50 + 50 = 100
    }
}