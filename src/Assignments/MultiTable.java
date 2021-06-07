package Assignments;
import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of which you want multiplication table.");
        int m = sc.nextInt();
        int i;
        int t=0;
        for(i=1; i<=10; i++){
            t = t+m;
            System.out.println(m +  " x " + i + " = " + t);
        }

    }
}
