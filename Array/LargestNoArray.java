import java.util.*;

public class LargestNoArray{
    public static void main(String args[]){
        int numbers [] = {4,2,6,20,8,10,12};
        
        int largestNo = findLargest(numbers);
        int smallestNo = findSmallest(numbers);
        
        System.out.println("largest No is "+ largestNo);

        System.out.println("smallest No is "+ smallestNo);
       
    }

    public static int findLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static int findSmallest(int[] numbers){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;
    }


}