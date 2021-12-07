package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Median {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0,1,2,4,6,5,3,7,8);

        System.out.println(findMedian(nums));
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        TreeSet<Integer> sorted = new TreeSet<Integer>();
        for(Integer num: arr){
            sorted.add(num);
        }
        Integer[] arra = new Integer[sorted.size()];
        sorted.toArray(arra);
        return arra[arra.length/2];
    }

}
