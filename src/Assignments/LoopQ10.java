package Assignments;
import java.util.Scanner;
public class LoopQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n number: ");
        int n = sc.nextInt();
        int i, j,k=0;
        for (i = 0; i <=n; i++) {
            for (j =1; j <=i; j++) {
                k++;
                System.out.print(k);

            }
            System.out.println();
        }
    }
}

