package Loops;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n number: ");
    int n = sc.nextInt();
    int i, j,p,q;

        for(i=1;i<=n;i++) {
            if (i % 2 == 0) {
                p = 1;
                q = 0;
            } else {
                p = 0;
                q = 1;
            }
            for (j = 1; j <= i; j++)
                if (j % 2 == 0) {
                    System.out.print(p);
                }
            else {
                    System.out.print(q);
                }
            System.out.println(" ");
        }
    }
}
