import java.util.*;

public class ReverseNo{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No ");
        int num= sc.nextInt();
        int rev=0,lastDigit =0;
        while(num>0){
            lastDigit=num%10;
            rev=rev*10+lastDigit;
            num=num/10;
        }
        System.out.println("reverse No "+rev);
    }
}