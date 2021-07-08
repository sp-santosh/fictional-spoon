package Loops;
import java.util.Scanner;
import java.math.*;
public class Q5 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of terms: ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println("Number is: "+i+ " and cube of " +i+" is: "+Math.pow(i,3));

        }
    }
}
