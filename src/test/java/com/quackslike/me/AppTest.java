package com.quackslike.me;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    App app = new App("Noah");

    @Test
    public void square_4() {
        int sqaureValue = app.square(4);
        assertEquals(16, sqaureValue);
    }

    @Test
    public void sum_2_2(){
        int sum = app.sum(2, 2);
        assertEquals(4, sum);
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
