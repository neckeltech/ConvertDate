package main;

import util.ConvertDate;

import java.net.DatagramSocket;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws ParseException {
        convert1();
        convert2();
        convert3();
    }

    private static void convert1(){
        Calendar today = ConvertDate.getAtualDate();
        Calendar nextMonth = ConvertDate.getNextMonthDate();
        long dif = nextMonth.getTimeInMillis() - today.getTimeInMillis();

        long days = TimeUnit.MILLISECONDS.toDays(dif);
        System.out.println("Days: " + days);
    }

    private static void convert2(){
        Calendar today = ConvertDate.getAtualDate();
        Calendar tomorrow = ConvertDate.getTomorrowDate();

        long milliseconds = tomorrow.getTimeInMillis() - today.getTimeInMillis();
        long hours = TimeUnit.MILLISECONDS.toHours(milliseconds);
        System.out.println("How many hours? " + hours);

        String formatedDate = ConvertDate.formatDateToString(ConvertDate.getAtualDate());
        System.out.println("Date formated: " + formatedDate);
    }

    private static void convert3() throws ParseException {
        Date date = ConvertDate.convertStringToDate("30/04/2022");
        Date newDate = ConvertDate.addOneDay(date);

        System.out.println("Date converted back to string: " + ConvertDate.formatDateToString(newDate));
    }
}
