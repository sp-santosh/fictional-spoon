package Assignments;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0,rem;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while(n!=0){
           rem=n%10;
           rev =rev*10+rem;
           n=n/10;
        }
        System.out.println(rev);
    }
}
