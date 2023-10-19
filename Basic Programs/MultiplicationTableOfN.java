import java.util.*;

public class MultiplicationTableOfN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int table = 0;
        System.out.println("Table of "+n);
        for(int i=1; i<=10;i++){
           table = n * i;
           System.out.println(table);
        }
        // System.out.println("second logic");
        // for(int i=1; i<=10;i++){
        //     table +=n;
        //     System.out.println(table);
        //  }
        
    }
}