package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.App;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5 ");
    }
}