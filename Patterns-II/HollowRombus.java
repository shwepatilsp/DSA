import java.util.*;

public class HollowRombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        for(int i=1 ; i<=n ;i++){

             //spaces
             for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle pattern code
            for(int j=1; j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            
            }
            System.out.println("");
        }
        
    }
}