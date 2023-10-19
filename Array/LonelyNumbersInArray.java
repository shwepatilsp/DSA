import java.util.*;

public class LonelyNumbersInArray{
    public static void main(String args[]){
        int nums [] = {4,5,10,3,12};
        getLonelyNumbers(nums);
    }
    
    public static void getLonelyNumbers(int[] nums){
        Arrays.sort(nums);

       for(int i=0;i<nums.length;i++){
           if(i==0){
                if(nums[i+1] - nums[i] > 1){
                    System.out.println(nums[i]);
                } 
            }else if(i==nums.length-1){
                if(nums[i] - nums[i-1] > 1){
                    System.out.println(nums[i]);
                }
            }else {
                if (nums[i+1] - nums[i] > 1 && nums[i] - nums[i-1] > 1){
                    System.out.println(nums[i]);
                }
            }
        }
       
    }
}