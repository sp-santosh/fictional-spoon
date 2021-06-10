package Assignments;
import java.util.Scanner;
public class Q8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Year: ");
            int year = sc.nextInt();
            boolean leap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    leap = year % 400 == 0;
                }
                else
                    leap = true;
            }

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }

