package school.mjc.stage0.conditions.finalTask;

import java.util.GregorianCalendar;

public class DaysInMonth {
    public void printDays(int year, int month) {

        switch (month){
            case 4,6,9,11-> System.out.println("30");
            case 1,3,5,7,8,10,12-> System.out.println("31");
            case 2-> System.out.println(new GregorianCalendar().isLeapYear(year)?"29":"28");
            default -> System.out.println("invalid date");


        }

    }
}
