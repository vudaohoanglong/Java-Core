package Calendar;

import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        Date date = calendar.getTime(); //
        System.out.println("The current date is : " + date);
        calendar.add(java.util.Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(java.util.Calendar.MONTH,+4);
        System.out.println("4 months later: " + calendar.get(java.util.Calendar.MONTH));
    }
}
