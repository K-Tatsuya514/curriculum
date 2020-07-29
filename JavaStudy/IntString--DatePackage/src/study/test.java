package study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        String dateTime = "2018/01/01 00:00:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date1 = sdf1.parse(dateTime);
        System.out.println(date1);

        Date date2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
        System.out.println(sdf2.format(date2));
    }
}