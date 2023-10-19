import java.util.*;

public class SumOfNatureNo{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0;
        int i =1;
        while(i<=n){
            //sum=sum+i;
            sum+=i; 
            i++;
        }
        System.out.println("Sum of N Naturals No "+sum);
    }
}