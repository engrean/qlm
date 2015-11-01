package com.quackslike.me;

import java.util.Calendar;

/**
 * Created by noah.
 */
public class DaysOld {

    public static final long MILLISECONDS = 1000;
    public static final long MINUTES = 60 * MILLISECONDS;
    public static final long HOURS = 60 * MINUTES;
    public static final long DAYS = 24 * HOURS;
    public static final long YEARS = 365 * DAYS;

    public int calculateAge(int day,int month,int year) {
        Calendar rightNow = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(year,month,day);

        int age = getAgeForYear(rightNow, birthDate);
        int diffDOY = getDiffDays(rightNow, birthDate);

        if (diffDOY < 0){
            age --;
        }
        System.out.println(age);
        return age;
    }

    int getDiffDays(Calendar rightNow, Calendar birthDate) {
        int thisDOY = rightNow.get(Calendar.DAY_OF_YEAR);
        int birthDOY = birthDate.get(Calendar.DAY_OF_YEAR);
        return thisDOY - birthDOY;
    }

    int getAgeForYear(Calendar rightNow, Calendar birthDate) {
        int thisYear = rightNow.get(Calendar.YEAR);
        int birthYear = birthDate.get(Calendar.YEAR);
        return thisYear - birthYear;
    }

}
