package com.dprabath.ch01;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class List01 {
    public static void main(String[] args) {
        List01 list01 = new List01();
        list01.execute();
    }

    private void execute() {
        int newsLetters = 3;
        final Calendar cal = Calendar.getInstance(Locale.US);
        for (int i = 0; i < newsLetters; i++) {
            int quarter = (cal.get(Calendar.MONTH) / 3) + 1;
            System.out.println("Month " + getMonthForInt(cal.get(Calendar.MONTH)) + " Qtr" + quarter
                                    + " " + cal.get(Calendar.YEAR));
            cal.add(Calendar.MONTH, -1);
        }
    }

    String getMonthForInt(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11 ) {
            month = months[num];
        }
        return month;
    }
}
