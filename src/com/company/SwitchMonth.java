//@author: Santosh Poudel
package com.company;
import java.util.Scanner;
public class SwitchMonth {
    public static void main(String[] strings) {

        Scanner sc = new Scanner(System.in);

        int DaysInMonth = 0;
        String Month = "Month";

        System.out.print("Input a month number: ");
        int month = sc.nextInt();
        System.out.print("Input a year: ");
        int year = sc.nextInt();
        switch (month) {
            case 1:
                Month = "January";
                DaysInMonth = 31;
                break;
            case 2:
                Month = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DaysInMonth = 29;
                } else {
                    DaysInMonth = 28;
                }
                break;
            case 3:
                Month = "March";
                DaysInMonth = 31;
                break;
            case 4:
                Month = "April";
                DaysInMonth = 30;
                break;
            case 5:
                Month = "May";
                DaysInMonth = 31;
                break;
            case 6:
                Month = "June";
                DaysInMonth = 30;
                break;
            case 7:
                Month = "July";
                DaysInMonth = 31;
                break;
            case 8:
                Month = "August";
                DaysInMonth = 31;
                break;
            case 9:
                Month = "September";
                DaysInMonth = 30;
                break;
            case 10:
                Month = "October";
                DaysInMonth = 31;
                break;
            case 11:
                Month = "November";
                DaysInMonth = 30;
                break;
            case 12:
                Month = "December";
                DaysInMonth = 31;
        }
        System.out.print(Month + " of " + year + " has " + DaysInMonth + " days.");
    }
}
