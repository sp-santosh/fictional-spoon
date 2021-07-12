package Methods;
import java.util.Scanner;
public class methodQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String mid = sc.next();
        String result = middle(mid);
        System.out.println("The middle character in the string: "+result);

    }
    public static String middle(String midd){
       int x ,y;
       int z= midd.length();
       if(z%2==0){
           x= (z/2)-1;
           y=2;
       }
       else{
           x=z/2;
           y=1;
       }
       return  midd.substring(x,x+y);
    }
}
