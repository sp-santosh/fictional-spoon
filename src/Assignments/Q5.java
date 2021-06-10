package Assignments;
import  java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet Character: ");
        char c = sc.next().charAt(0);
        if(c>=65 && c<=90) {
            System.out.println("UPPER CASE");
        }
           else if(c>=97 && c<=122) {
                 System.out.println("lower case");
        }
            else
            System.out.println("you have entered wrong character");
        }
    }