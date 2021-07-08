package Loops;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want multi table:");
        int n = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n + " X "+i+" = "+n*i);
        }
    }
}
