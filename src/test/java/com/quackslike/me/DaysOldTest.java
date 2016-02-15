package com.quackslike.me;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**
 * Created by noah
 */
public class DaysOldTest {
    DaysOld ageCalc = new DaysOld();

    @Test
    public void DaysOld_17() {
        int yourage = ageCalc.calculateAge(5, 11, 1997);
        assertEquals(18,yourage);
    }

    @Test
    public void DaysOld_21() {
        int yourage = ageCalc.calculateAge(5, 11, 1993);
        assertEquals(22,yourage);
    }

    @Test
    public void DaysOld_52() {
        int yourage = ageCalc.calculateAge(5, 11, 1958);
        assertEquals(57,yourage);
    }

    @Test
    public void getAgeForYear_yesterday(){
        Calendar now = Calendar.getInstance();
        Calendar lastYearYesterday = Calendar.getInstance();
        int yesterdayDay = lastYearYesterday.get(Calendar.DAY_OF_YEAR) - 1;
        int lastYear = lastYearYesterday.get(Calendar.YEAR) - 1;

        lastYearYesterday.set(Calendar.YEAR, lastYear);
        lastYearYesterday.set(Calendar.DAY_OF_YEAR, yesterdayDay);
        int age = ageCalc.getAgeForYear(now, lastYearYesterday);
        assertEquals("should be one because we only check year naively", 1, age);
    }

    @Test
    public void getAgeForYear_tomorrow(){
        Calendar now = Calendar.getInstance();
        Calendar lastYearTomorrow = Calendar.getInstance();
        int yesterdayDay = lastYearTomorrow.get(Calendar.DAY_OF_YEAR) + 1;
        int lastYear = lastYearTomorrow.get(Calendar.YEAR) - 1;

        lastYearTomorrow.set(Calendar.YEAR, lastYear);
        lastYearTomorrow.set(Calendar.DAY_OF_YEAR, yesterdayDay);
        int age = ageCalc.getAgeForYear(now, lastYearTomorrow);
        assertEquals(1, age);
    }
}
