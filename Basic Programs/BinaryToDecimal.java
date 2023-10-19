import java.util.*;

public class BinaryToDecimal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        
       
        int b_no= BinaryToDecimal(n);

        System.out.println("decimal of "+n + " is "+b_no );
    }

    public static int BinaryToDecimal(int binNo){
        int pow=0;
        int lastDigit;
        int decNo=0;
        while(binNo>0){
            lastDigit = binNo % 10;
            decNo = decNo + (lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNo=binNo/10;
        }
        return decNo;
    }
}