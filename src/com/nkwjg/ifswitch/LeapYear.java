package com.nkwjg.ifswitch;

import java.util.Calendar;

public class LeapYear {
    public static void main(String[] args) {
        int year = getYear();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }

    private static int getYear() {
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        return year;
    }
}
