import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Date_Build {
    long getMlsc(String date_str) {
        long mlsc = -1;
        SimpleDateFormat a = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        try {
            Date date = a.parse(date_str);
            mlsc = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return mlsc;
    }
}

class T_Date extends Date_Build {
    public Date build(String date_str) {
        Date date;
        long mlsc = getMlsc(date_str);
        date = new Date(mlsc);
        return date;
    }
}

class T_Calendar extends Date_Build {
    Calendar build(String date_str) {
        Calendar calendar = Calendar.getInstance();

        try {
            SimpleDateFormat a = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            calendar.setTime(a.parse(date_str));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar;
    }
}


public class Time_Data {
    void task1() {
        System.out.println("Введите дату в следующем формате: dd-MM-yyyy HH:mm");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");;
        String dateString = scanner.next();

        T_Date t_date = new T_Date();
        Date date = t_date.build(dateString);
        System.out.println(date);

        T_Calendar t_calendar = new T_Calendar();
        Calendar calendar = t_calendar.build(dateString);
    }


    public static void main(String[] args) {
        Time_Data time = new Time_Data();
        time.task1();
    }
}