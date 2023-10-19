import java.util.*;

public class PrimeInTheRange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        
        System.out.println("List of primes no");
        IsPrimeInRanges(n);
    }

    public static void IsPrimeInRanges(int n){
        for(int i=2; i<=n; i++){
            if(IsPrime(i)){
            System.out.println(i+"");
            }
        }
    }

    public static boolean IsPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        } 
        return true;   
    }

}