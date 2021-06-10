/*Write a program to input the annual income from user and compute the tax according to the given conditions and display the total tax:

Total Annual Taxable Income	   	Tax Rate

Upto Rs.1,00,000			   No tax

From 1,00,001 to 1,50,000	   10% of the income exceeding Rs.1,00,000

From 1,50,000 to 2,50,000	   Rs.5000 +20% of the income exceeding Rs.1,50,000

Above Rs.2,50,000		   Rs.25,000 +30% of the income exceeding Rs.2,50,000*/
//@author Santosh poudel
 package Assignments;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double income,tax=0,totalTax=0,extra=0;
        System.out.println("Enter your Salary: ");
    income = sc.nextDouble();
    if(income<=100000){
        tax=0;
    }
    else if(income<=150000){
        tax=10;
    }
    else if(income<=250000){
        tax=20;
        extra=5000;
    }
    else{
        tax=30;
        extra=25000;
        }
        totalTax=((income*(tax/100))+extra);
        System.out.println("The total tax is: " + totalTax);
    }
}

