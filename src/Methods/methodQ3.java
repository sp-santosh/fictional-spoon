package Methods;
import java.util.Scanner;
public class methodQ3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a first number:");
        int num1= sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter a third number: ");
        int num3=sc.nextInt();
        int result=smallest(num1,num2,num3);
        System.out.println("The smallest number is: "+result);

    }
    public static int smallest(int x,int y, int z){
        if(x<y && x<z){
            return x;
        }
        else if(y<x && y<z){
            return y;
        }
        else
            return z;

    }

}
