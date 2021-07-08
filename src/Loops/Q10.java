package Loops;
public class Q10 {
    public static void main(String[] args) {
        int i,j,k=0;
        for(i=1;i<=4;i++){
            for (j=1;j<=i;j++){
                k=k+1;
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}
