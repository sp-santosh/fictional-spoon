//Declare and initialize three integer variables x, y and z as 15, 2 and 8. Arrange and print the variables in ascending order.
package Assignments;

public class Q11 {
    public static void main(String[] args) {
        int x= 15;
        int y= 2;
        int z = 8;
        if (x >= y) {
            if (y >= z)
                System.out.print("In Ascending order: " + z + " " + y + " " + x);
            else if (z >= x)
                System.out.print("In Ascending order: " + y + " " + x + " " + z);
            else if (x >= z)
                System.out.print("In Ascending order: " + y + " " + z + " " + x);
        } else {
            if (z >= y)
                System.out.print("In Ascending order: " + x + " " + y + " " + z);
            else if (z >= x)
                System.out.print("In Ascending order: " + x + " " + z + " " + y);
            else if (x >= z)
                System.out.print("In Ascending order: " + z + " " + x + " " + y);
        }
    }
}
