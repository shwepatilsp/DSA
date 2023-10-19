import java.util.*;

public class MaxSubArraySumBF{
    public static void main(String args[]){
        int numbers [] = {-1,-2,-3,-4};
        maxSubArraySum(numbers);
    }
  
    public static void maxSubArraySum(int[] numbers){
        // 1. Brute Force - Time Complexity O(n3)
        // int maxSum = Integer.MIN_VALUE;
        // int currentSum;
        // for(int i= 0;i<numbers.length;i++){
        //     int start = i;
        //     for(int j= i;j<numbers.length;j++){
        //         int end = j;
        //         currentSum = 0;
        //         for(int k=start; k<=end;k++){
        //             currentSum +=  numbers[k];
        //             System.out.println(currentSum);     
        //             if(currentSum > maxSum){
        //                 maxSum = currentSum;
        //             }
        //         }    
        //     }
        // }   
        // System.out.println("Maximum subarray sum = "+maxSum);     

        // 2. Prefix Array Approach - Time Complexity O(n2)
        // int maxSum = Integer.MIN_VALUE;
        // int currentSum;
        // int prefix[] = new int[numbers.length];
        
        // prefix[0] = numbers[0];
        // for(int i= 1 ; i< numbers.length ; i++){
        //     prefix[i] = prefix[i-1]+numbers[i];
        // }

        // for(int i= 0;i<numbers.length;i++){
        //     int start = i;
        //     for(int j= i;j<numbers.length;j++){

        //         int end = j;
        //         currentSum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];

        //         if(currentSum > maxSum){
        //             maxSum = currentSum;
        //         }
                   
        //     }
        // }   
        // System.out.println("Maximum subarray sum = "+maxSum);  

        //3. Kadane's Algorithm - - Time Complexity O(nx`)
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        boolean allNegative = true;
        int largestNegative = Integer.MIN_VALUE;
        // to check any of the no in array is positive or array not containing all negative nos
        for(int i= 0;i<numbers.length;i++){
            if(numbers[i]>=0){
                allNegative=false;
                break;
            }

            largestNegative=Math.max(numbers[i],largestNegative);
        }
        if(allNegative){   
            maxSum=largestNegative;
        }else{
        for(int i= 0;i<numbers.length;i++){
            currentSum += numbers[i];
            if(currentSum<0){
                currentSum=0; 
            }
            
            maxSum=Math.max(currentSum,maxSum);                       
        }  
        } 
        System.out.println("Maximum subarray sum = "+maxSum);  


    }

}