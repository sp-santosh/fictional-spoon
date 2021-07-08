package FirstAssignment;
import java.util.Scanner;
public class FA_Q4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int total =0;
            System.out.println("Enter Size:");
        int size = sc.nextInt();
        int [] numbers= new int[size];
        System.out.println("Enter "+size+" integer values: ");
        for(int i=0;i<size;i++){
           numbers[i] = sc.nextInt();
        }
        System.out.print(" Odd numbers are: ");
        for(int i =0;i<size;i++){
        if(numbers[i]%2==1){
            total=total+numbers[i];
           System.out.print(numbers[i]+" ");
        }
        }
        System.out.println("\n Total sum of odd numbers is :"+total);
        }
    }

