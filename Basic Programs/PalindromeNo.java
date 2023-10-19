import java.util.*;

public class PalindromeNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        checkPalindromeNo(num);   
    }

    public static void checkPalindromeNo(int num){
        int lastDigit;
        int rev=0;
        int originalNo = num;
        while(num>0){
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num/10;   
        }

        //System.out.println("rev "+rev);
        
        if(originalNo==rev){
            System.out.println("Number is a palindrome");
        }else{
            System.out.println("Number is not a palindrome");
        }
    }    
    
}