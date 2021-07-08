package Loops;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows: ");
        int n = sc.nextInt();
        for(i=2;i<=10;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
