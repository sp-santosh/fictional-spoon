package Assignments;
import java.util.Scanner;
public class LoopQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n number: ");
        int n = sc.nextInt();
        int i, j;
        for (i = 0; i <=n; i++) {
            for (j =n; j >= i; j--) {
                System.out.print(" ");
            }

            for (j =1; j <=i; j++) {

                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}
