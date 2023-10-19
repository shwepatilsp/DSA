import java.util.*;

public class FindDuplicateNoInArray{
    public static void main(String args[]){
        int nums [] = {1,2,3,1};
        boolean isDuplicate = checkDuplicateNoInArray(nums);
        System.out.println(isDuplicate);
    }
    
    
    public static boolean checkDuplicateNoInArray(int[] nums){
        // Brute Force - Time Complexity O(n2)
    //     for(int i=0;i<nums.length;i++){
    //      for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //            return true;
    //         }
    //      }
    //    }
    //     return false;

    //Optimized solution - Time Complexity O(n)
        Set<Integer> uniqueSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(uniqueSet.contains(nums[i])){
                return true;
            }else{
                uniqueSet.add(nums[i]);
            }
        }    
        return false;
    }
    
}