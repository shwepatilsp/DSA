import java.util.*;

public class PairsInArray{
    public static void main(String args[]){
        int numbers [] = {2,4,6,8,10};
        pairsInArray(numbers);
    }
   //formula for total no of pairs is n(n-1)/2
   //Code time complexity O(n pow 2)
    public static void pairsInArray(int[] numbers){
        int tp=0;
        for(int i= 0;i<numbers.length;i++){
            for(int j= i+1;j<numbers.length;j++){
            System.out.print( "("+numbers[i]+","+numbers[j]+")");
            tp++;
        }
        System.out.println();
    }
    System.out.println("total pairs = "+tp);
}

}