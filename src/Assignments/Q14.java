//Write a program to find the sum of 3-digit number input by user.
//Example: if the sum of 234 is 2+3+4=9.
package Assignments;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int r;
        int sum=0;
        while(n!=0){
            r=n%10;
            sum=r+sum;
            n=n/10;
        }
        System.out.println(sum);
    }
}
