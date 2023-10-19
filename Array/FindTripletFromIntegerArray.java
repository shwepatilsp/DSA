import java.util.*;

public class FindTripletFromIntegerArray{
    public static void main(String args[]){
        int nums [] = {-1,0,1,2,-1,-4};
        getTriplet(nums);
    }

    // Brute Force Solution - Time complexity O(n3)
    public static void getTriplet(int[] nums){
       
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){ 
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i] + nums[j] + nums[k] == 0)){
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                       // System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                       Collections.sort(triplet); // sorting is necessary to check duplicate triplet will not be added to list
                       if (!result.contains(triplet)) {
                        result.add(triplet);
                    }
                    }
                }
            }
        }
        System.out.println(result);
    }
}