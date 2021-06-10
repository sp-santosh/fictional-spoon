// Write a program that checks if the number input by user is odd or even and display message accordingly
package Assignments;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("The Input number is even: "+ a);
        }
        else
            System.out.println("The Input number is odd: " + a);
    }
}
