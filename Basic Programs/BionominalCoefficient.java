import java.util.*;

public class BionominalCoefficient{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        int binCoefficient = bionominalCoefficient(n,r);
        System.out.println("Bionominal Coefficient " + binCoefficient);
        
    }

    public static int bionominalCoefficient(int n , int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact= factorial(n-r);

        int binCoefficient = n_fact/(r_fact*nmr_fact);
        return binCoefficient;
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n;i++){
           fact = fact * i;
        }
        return fact;
    }
}