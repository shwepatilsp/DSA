import java.util.*;

public class ButterflyPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        for(int i=1 ; i<=n ;i++){
            //star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");
        }
        
        for(int i=n ; i>=1 ;i--){
            //star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}