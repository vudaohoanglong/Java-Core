package Date;



public class Date {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date(); // get current
        System.out.println(date);
        java.util.Date date1 = new java.util.Date(2000-1900,1,24);
        System.out.println(date1);
        date1.setTime(1000);
        System.out.println(date1);
    }
}
