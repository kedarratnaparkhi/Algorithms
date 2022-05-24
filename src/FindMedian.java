import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result5 {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 5,3,1,2,4
     *
     * 3,5,1,2,4
     * 3,1,5,2,4
     * 3,1,2,5,4
     * 3,1,2,4,5
     */

    public static int findMedian(List<Integer> arr) {

        Integer[] sorted = new Integer[arr.size()];
        arr.toArray(sorted);
        Arrays.sort(sorted);
        System.out.println(sorted);
        int i=-1;
        System.out.println(sorted[i]);
//        for(int i=0;i<arr.size();i++){
//            if(arr.get(i) > arr.get(i+1)){
//                int temp = arr.get(i);
//                arr.set(i, arr.get(i+1));
//                arr.set(i+1, temp);
//            }
//        }
        return sorted[sorted.length/2];
    }

}

public class FindMedian {
    public static void main(String[] args) throws IOException {


        int result = Result5.findMedian(Arrays.asList(5,3,1,2,4));
        System.out.println(result);

    }
}
