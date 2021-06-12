//Write a program to print absolute value of a number entered by user. E.g.-
//INPUT: 1 OUTPUT: 1
//INPUT: -1 OUTPUT: 1
package Assignments;
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a =n;
        if(n<0){
            a = a* -1;
            System.out.println("The absolute of " + n+" is " + a);
        }
        else   {
            System.out.println("The absolute of " + n+" is " + n);
        }
    }
}
