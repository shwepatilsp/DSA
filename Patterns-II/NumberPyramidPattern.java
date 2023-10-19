import java.util.*;

public class NumberPyramidPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // Print spaces to align the numbers to the right
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            
            // Print the number for this row repeatedly
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if(j!=i){
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next line for the next row
        }
    }
}