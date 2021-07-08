package Loops;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int s=0;
        System.out.println("Enter the number of term: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            s++;
            sum=sum+s;
             if(s%2==1){
                 System.out.println(s);
             }
             s++;

        }
        System.out.println("The sum of odd Natural Number up to "+n+" is: "+sum);
    }
}
