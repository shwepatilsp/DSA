import java.util.*;

public class DecimalToBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        
       
        int binaryNo= DecimalToBinary(n);

        System.out.println("binary of "+n + " is "+binaryNo );
    }

    public static int DecimalToBinary(int decimalNo){
        int pow=0;
        int rem;
        int binaryNo=0;
        while(decimalNo>0){
            rem = decimalNo % 2;
            binaryNo = binaryNo + (rem * (int) Math.pow(10,pow));
            pow++;
            decimalNo=decimalNo/2;
        }
        return binaryNo;
    }
}