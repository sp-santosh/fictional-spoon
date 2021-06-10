package Assignments;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = sc.nextInt();
        if(i%5==0 && i%2==0){
            System.out.println("The Number is Divisible by 5 and even " );

        }
        else
            System.out.println("The Number is either odd or Not divisible by 5");
    }
}
