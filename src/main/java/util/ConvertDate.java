package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConvertDate {
    public static Calendar getAtualDate(){
        return Calendar.getInstance();
    }

    public static Calendar getNextMonthDate(){
        Calendar calendar = getAtualDate();
        calendar.add(Calendar.MONTH, 1);

        return calendar;
    }

    public static Calendar getTomorrowDate(){
        Calendar calendar = getAtualDate();
        calendar.add(Calendar.DATE, 1);

        return calendar;
    }

    public static String formatDateToString(Calendar calendar){
        return formatDateToString(calendar.getTime());
    }

    public static String formatDateToString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }

    public static Date convertStringToDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date newDate = dateFormat.parse(date);
        return  newDate;
    }

    public static Date addOneDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        return  calendar.getTime();
    }
}
