import java.util.*;

public class SearchInRotatedSortedArray{
    public static void main(String args[]){
        int nums [] = {20,30,40,50,60,5,10};
        int target = 5;
        int index = checkIndexOfTargetElement(nums,target);
       // System.out.println(index);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("index is "+index);
        }
    }
    
    // Time complexity O(n) 
    // public static int checkIndexOfTargetElement(int[] nums,int target){
     
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==target){
    //             return i;
    //         }
    //     }    
    //     return -1;
    // }

    // we have asked for time complexity as O(nlogn)
    public static int checkIndexOfTargetElement(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        System.out.println("end"+ end);
        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[start]<nums[mid]){
                if(target >= nums[start] && target < nums[mid]){ // we are discarding left array if this if condition is not true
                    end = mid-1;
                }else {
                    start = mid+1; // moving towards right
                }
            }else{
                if( target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }   
            }
        
        }   
    return -1;
}
}