package Assignments;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet Character: ");
      char c = sc.next().charAt(0);

        if(c>=65 && c<=90) {
           char e = (char) (c + 32);
            System.out.println("The lowercase Character of Input is: "+e);
        }
        else if(c>=97 && c<=122) {
            char f = (char) (c-32);
            System.out.println("The UPPERCASE Character of Input is: "+f);
        }
    }
}
