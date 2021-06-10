package Assignments;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float area=0.00f;
        float pi=3.14f;
        System.out.println("Enter C , R , S to calculate area of circle or Rectangle or Square: ");
        char choose= sc.next().charAt(0);
        if(choose == 'C'){
            System.out.println("Enter radius: ");
            float r= sc.nextFloat();
            area = pi*r*r;
        }
        else if(choose=='R'){
            System.out.println("Enter length and breadth :");
        float l=sc.nextFloat();
        float b = sc.nextFloat();
        area=l*b;
        }
        else if(choose=='S'){
            System.out.println("Enter a side: ");
            float s = sc.nextFloat();
            area = s*s;
        }
        else {
            System.out.println("You have entered wrong character.");
        }
        System.out.println("The area is:  "+area);
    }
}
