import java.util.Scanner;

public class Calendar {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    print();
    }
    public static String getting_month() {
        System.out.println("Input number of the month");
        int month = sc.nextInt();
        switch(month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }
    public static int getting_year() {
        System.out.println("Input a year:");
        int year = sc.nextInt();
        return year;
    }
    public static void print(){
        int year = getting_year();
        String month = getting_month();
        System.out.println(year);
        System.out.println(month);
    }
}
