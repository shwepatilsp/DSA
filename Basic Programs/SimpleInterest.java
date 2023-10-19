import java.util.*;

public class SimpleInterest{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount");
        int principalAmount = sc.nextInt();
        System.out.println("Enter Rate");
        int rate = sc.nextInt();
        System.out.println("Enter Time");
        int time = sc.nextInt();

        int simpleInterest = (principalAmount*rate*time)/100;

        System.out.println("Simple Interest "+simpleInterest);
    }
}