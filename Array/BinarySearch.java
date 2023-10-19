import java.util.*;

public class BinarySearch{
    public static void main(String args[]){
        int numbers [] = {2,4,6,8,10,12,20};
        int key = 10;
        int index = binarySearch(numbers,key);

        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("index is "+index);
        }
       
    }
  //** Binary Search always work on only sorted array that is prerequisite for binary search/  
  // we consider start , end and mid. if key is equal to mid will return key if key is less than mid will search in left
  //if key is greater than mid and search to right and will keep repeating until we left with array of single element.
  // We calculate time complexity based on iteration , (start+end)/2 pow 0 then (start+end)/2 pow 1 and so on until 2 pow k
  //i.e. log2n we represent as O(logn). For array size 8 Linear search if taking 8 then binary will take 4
    public static int binarySearch(int[] numbers , int key){
        int start = 0;
        int end = numbers.length-1;
    
        while(start<=end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }else if(mid<key){
                start ++;
            }else {
                end --;
            }
        }
        return -1;
    }

    


}