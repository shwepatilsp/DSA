import java.util.*;

public class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        // Approach 1 : Using if

        // if(year % 4 == 0){
        //     if(year % 100 == 0){

        //         if(year % 400 == 0){
        //             System.out.println("Its a leap year");
        //         }else{
        //             System.out.println("Not a leap year");
        //         }      

        //     }else{
        //         System.out.println("Its a leap year");
        //     }        

        // }else{
        //     System.out.println("Not a leap year");
        // }

        //Approach 2 : Using ternary if

        boolean isLeapYear = (year % 4 == 0) ? (year % 100 == 0) ? (year % 400 == 0) ? true : false : true : false;

        if(isLeapYear){
            System.out.println("Its a leap year");
        }else{
            System.out.println("Not a leap year");
        }


        
    }
}