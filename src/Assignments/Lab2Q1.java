/* Write a program that takes two numbers as input from users and print the largest among them. */
package Assignments;
import java.util.Scanner;
public class Lab2Q1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
     int a = sc.nextInt();
     int b = sc.nextInt();
     if (a>b){
         System.out.println("The largest number is: " +a);
     }
     else
         System.out.println("The largest number is: " +b);
    }
}
