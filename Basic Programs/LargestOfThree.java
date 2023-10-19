
import java.util.*;

public class LargestOfThree{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int A = sc.nextInt();
        System.out.println("Enter B");
        int B = sc.nextInt();
        System.out.println("Enter C");
        int C = sc.nextInt();
       
        if(A >=B && A>=C){
            System.out.println("Larget no is "+A); 
        }
        else if(B>=C){
            System.out.println("Larget no is "+B); 
        }else{
            System.out.println("Larget no is "+C); 
        }
        
         
    }
}