package Assignments;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = sc.nextInt();
        if(i%5==0){
            System.out.println("The number is divisible by 5");

        }
        else
            System.out.println("The number is not divisible by 5");

    }

}
