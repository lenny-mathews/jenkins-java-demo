package com.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class AppTest {
    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(5, 10);
        assertEquals(15, result);
    }
}