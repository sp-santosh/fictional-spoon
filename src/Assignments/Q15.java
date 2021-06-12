//Write a program to check whether the 3-digit number input by user is palindrome or not.
//Example: 232 is palindrome since the number is same from forward and reverse direction
package Assignments;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0,rem,p;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        p=n;
        while(p!=0){
            rem=p%10;
            rev =rev*10+rem;
            p=p/10;
        }
        System.out.println(rev);
        if(n==rev){
            System.out.println("The number is palindrome.");

        }
        else
            System.out.println("The number is not palindrome.");
    }
}
