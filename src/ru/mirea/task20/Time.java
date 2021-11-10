import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("Введите *год* *месяц* *число* *часы* *минуты*");
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, scanner.nextInt());
        String month = scanner.next();
        int monthnumber = 0;
        switch (month){
            case "jan":{
                monthnumber = 0;
                break;
            }
            case "feb":{
                monthnumber = 1;
                break;
            }case "Mar":{
                monthnumber = 2;
                break;
            }
            case "Apr":{
                monthnumber = 3;
                break;
            }case "May":{
                monthnumber = 4;
                break;
            }case "June":{
                monthnumber = 5;
                break;
            }case "July":{
                monthnumber = 6;
                break;
            }
            case "Aug":{
                monthnumber = 7;
                break;
            }
            case "Sept":{
                monthnumber = 8;
                break;
            }
            case "Oct":{
                monthnumber = 9;
                break;
            }
            case "Nov":{
                monthnumber = 10;
                break;
            }
            case "Dec":{
                monthnumber = 11;
                break;
            }
        }
        calendar.set(Calendar.MONTH, monthnumber);
        calendar.set(Calendar.DAY_OF_MONTH, scanner.nextInt());
        calendar.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
        calendar.set(Calendar.MINUTE, scanner.nextInt());
        calendar.set(Calendar.SECOND, 0);
        System.out.println("Номер 1: " + calendar.getTime());


        System.out.println("Номер 2: Иванов, срок выполнения задания 20 дней");
        System.out.print("Получено: ");
        Calendar calendar2 = new GregorianCalendar(2020, 0 , 25, 8, 10);
        System.out.println(calendar2.get(Calendar.DAY_OF_MONTH) + " " + calendar2.get(Calendar.MONTH) + " " +
                calendar2.get(Calendar.YEAR) + " " + calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE));
        calendar2.add(Calendar.DAY_OF_MONTH, 20);
        System.out.print("Дата сдачи: ");
        System.out.println(calendar2.get(Calendar.DAY_OF_MONTH) + " " + calendar2.get(Calendar.MONTH) + " " +
                calendar2.get(Calendar.YEAR) + " " + calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE));
    }
}