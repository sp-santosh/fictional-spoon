package Loops;
import  java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sum=0;
        for(int i = 0;i<5;i++){
            int n = sc.nextInt();
            System.out.println("Enter new number: ");
            sum = sum+n;

        }
        System.out.println("The sum is :" +sum  );

        System.out.println("the average is "+ sum/5);
    }
}
