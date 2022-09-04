import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        for (;;) {
            String month ;
            Scanner days = new Scanner(System.in);
            System.out.println("enter the number : ");
            month = days.next();
            switch (month) {
                case "january":
                    System.out.println(31);
                    break;
                case "february":
                    System.out.println(28);
                    break;
                case "march":
                    System.out.println(31);
                    break;
                case "april":
                    System.out.println(30);
                    break;
                case "may":
                    System.out.println(31);
                    break;
                case "jun":
                    System.out.println(30);
                    break;
                case "july":
                    System.out.println(31);
                    break;
                case "august":
                    System.out.println(30);
                    break;
                case "september":
                    System.out.println(31);
                    break;
                case "october":
                    System.out.println(30);
                    break;
                case "november":
                    System.out.println(31);
                    break;
                case "december":
                    System.out.println(30);
                default:
                    System.out.println("invalid");
    }
}}}
