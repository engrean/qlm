package com.quackslike.me;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    App app = new App("Noah");

    @Test
    public void square_zero() {
        int sqaureValue = app.square(0);
        assertEquals(0, sqaureValue);
    }

    @Test
    public void sum_1_2(){
        int sum = app.sum(1, 2);
        assertEquals(3, sum);
    }

//    @Test
//    public void square_1() {
//        assertEquals(1, app.square(1));
//    }
}
