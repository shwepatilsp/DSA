import java.util.*;

public class ReverseArray{
    public static void main(String args[]){
        int numbers [] = {2,4,6,8,10,10,12};
        reverseArray(numbers);
    }
    // we can run loop from last to start and copy that element to different array but it will take space complexoty as O(n)
    // whereas swapping takes space complexity of O(1)
    public static void reverseArray(int[] numbers){
        int first = 0;
        int last = numbers.length-1;
        
        while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]=temp;

            first++;
            last-- ;
        }

        for(int i= 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }


}