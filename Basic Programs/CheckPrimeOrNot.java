import java.util.*;

public class CheckPrimeOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        
            boolean isPrime=true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(n + " is prime no");
            }else{
                System.out.println(n + " is not prime no");
            }
        
        
    }
}