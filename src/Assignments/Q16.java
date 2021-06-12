//Write a program to check it a number input by user is Armstrong number or not
//Example: 153 is Armstrong number since 1^3 +5^3 +3^3= 153
package Assignments;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args)  {
        int c=0,a,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
