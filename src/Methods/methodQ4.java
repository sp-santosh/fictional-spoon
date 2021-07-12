package Methods;
import java.util.Scanner;
public class methodQ4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a first number:");
        float num1= sc.nextInt();
        System.out.println("Enter a second number: ");
        float num2=sc.nextInt();
        System.out.println("Enter a third number: ");
        float num3=sc.nextInt();
        float result=average(num1,num2,num3);
        System.out.println("The average value is "+result);
    }

    public static float average (float num1, float num2,float num3){
        return (num1+num2+num3)/3;
    }
}
