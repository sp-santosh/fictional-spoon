//Write a program to print the reverse of a 3-digit number input by user.
//Example: if the number input by user is 325, then the output should be 523.
package Assignments;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0,rem;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while(n!=0){
           rem=n%10;
           rev =rev*10+rem;
           n=n/10;
        }
        System.out.println(rev);
    }
}
