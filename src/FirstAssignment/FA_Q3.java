package FirstAssignment;

public class FA_Q3 {
    public static void main(String[] args) {
        int a =2,b=-7,c=15;
        float x;
        x=c/a-b++;
        System.out.println("Value of 1st expression :"+x);
        System.out.println("For next expression \n Value of a = "+a+" and value of b = "+b+" and value of c = "+c);
        x=27*b++-16%++a;
        System.out.println("Value of 2nd expression :"+x);
        System.out.println("For next expression \n Value of a = "+a+" and value of b = "+b+" and value of c = "+c);
        x=(float)c/a;
        System.out.println("Value of 3rd expression :"+x);
        System.out.println("For next expression \n Value of a = "+a+" and value of b = "+b+" and value of c = "+c);
        x= a*b-c++;
        System.out.println("Value of 4th expression :"+x);
        System.out.println("For next expression \n Value of a = "+a+" and value of b = "+b+" and value of c = "+c);
        x=18/++a+a++;
        System.out.println("Value of 5th expression :"+x);
        System.out.println("For next expression \n Value of a = "+a+" and value of b = "+b+" and value of c = "+c);
    }
}
/*
Output:
Value of 1st expression :14.0
For next expression
 Value of a = 2 and value of b = -6 and value of c = 15
Value of 2nd expression :-163.0
For next expression
 Value of a = 3 and value of b = -5 and value of c = 15
Value of 3rd expression :5.0
For next expression
 Value of a = 3 and value of b = -5 and value of c = 15
Value of 4th expression :-30.0
For next expression
 Value of a = 3 and value of b = -5 and value of c = 16
Value of 5th expression :8.0
For next expression
 Value of a = 5 and value of b = -5 and value of c = 16

 */