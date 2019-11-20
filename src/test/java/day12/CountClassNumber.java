package day12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CountClassNumber {
    public static void main(String[] args)  {
        int amountOfPassedClasses = getAmountOfPassedClasses();
        System.out.println("We had '" + amountOfPassedClasses + "' classes");
    }
    private static int getAmountOfPassedClasses()  {
        LocalDate startDate = LocalDate.parse("2019-10-09");
        LocalDate today = LocalDate.now();
        long daysPassed = ChronoUnit.DAYS.between(startDate, today);
        int classes = 0;
        for (int i = 0; i < daysPassed; i++) {
            LocalDate adjustedDate = startDate.plusDays(i);
            int weekDay = adjustedDate.getDayOfWeek().getValue();
            if (weekDay == 1 || weekDay == 3) {
                classes++;
            }
        }
        return classes;
    }
}
