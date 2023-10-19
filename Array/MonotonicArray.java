import java.util.*;

public class MonotonicArray{
    public static void main(String args[]){
        int nums [] = {4,4,2,1};
        boolean isIncreasing=isIncreasing(nums);
        boolean isDescreasing=isDescreasing(nums);

        if(isIncreasing || isDescreasing){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
    public static boolean isIncreasing(int[] nums){
       for(int i=0;i<nums.length-1;i++){
           if(nums[i] > nums[i+1]){
            return false;
           }
        }
        return true;
    }

    public static boolean isDescreasing(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
             return false;
            }
         }
         return true;
     }

}