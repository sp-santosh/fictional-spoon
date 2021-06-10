package Assignments;
/* Santosh Poudel */
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float discount,discountRate = 0f,amountOfPurchase,netAmount=0;
        System.out.println("What you want to purchase Laptop(L) Or Desktop(D): ");
        char c = sc.next().charAt(0);
        System.out.println("Enter price you want to invest: ");
        amountOfPurchase= sc.nextFloat();
        if(c =='L'){
            System.out.println("Laptop");
            if(amountOfPurchase<=25000){ //amountOfPurchase>0 &&
                discountRate=0.0f;
            }
            else if(amountOfPurchase<=57000){ //amountOfPurchase>25000 &&
                discountRate= 5.0f;
            }
            else if( amountOfPurchase<=100000){ //amountOfPurchase>57000 &&
                discountRate=7.5f;
            }
            else { //if(amountOfPurchase>100000)
                discountRate=10.0f;
            }
        }
        else if(c=='D'){
            System.out.println("Desktop");
            if(amountOfPurchase<=25000){ //amountOfPurchase>0 &&
                discountRate=5.0f;
            }
            else if( amountOfPurchase<=57000){  //amountOfPurchase>25000 &&
                discountRate= 7.5f;
            }
            else if(amountOfPurchase<=100000){ //amountOfPurchase>57000 &&
                discountRate=10.0f;
            }
            else{ //(amountOfPurchase>100000)
                discountRate=15.0f;
            }
        }
    else{
            System.out.println("No Item Found in that name.");
        }
        discount = (discountRate /100)*amountOfPurchase;
        netAmount = amountOfPurchase-discount;
        System.out.println("The total discount is: "+ discount);
        System.out.println("The Net Amount is: "+netAmount);
    }
}