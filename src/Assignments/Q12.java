//Write a program to find whether a given character is a digit or a letter. Test your program.
package Assignments;
import java.util.Scanner;
public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char a = sc.next().charAt(0);
        if (a >= 48 && a <= 57) {
            System.out.println("you have entered a digit.");
        }
        else if(a>=65 && a<=90 || a>=97 && a<=122)
        {
            System.out.println("You have entered letter.");
        }
        else
            System.out.println("You have entered other character.");
    }
}
