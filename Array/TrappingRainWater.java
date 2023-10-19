import java.util.*;

public class TrappingRainWater{
    public static void main(String args[]){
        int height [] = {4, 2, 0, 3, 2, 5};
        findTrappingRainWater(height);
    }
    
    public static void findTrappingRainWater(int[] height){
       int n = height.length;
         // Calculate Left Max boundary
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
           // Calculate Right Max boundary
        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
         // Calculate water level
          // Calculate trapped rain water
        int trappingRainWater = 0;
        for(int i= 0;i<n;i++){
            int waterLevel= Math.min(leftMax[i],rightMax[i]);
            trappingRainWater += waterLevel - height[i];

        }   
        System.out.println("Trapping rain water "+ trappingRainWater);
    }

}