import java.io.*;
import java.util.*;


class Result3 {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int pairsCount = 0;
        for(int i=0;i<ar.size();i++){
            for(int j=i+1;j<ar.size();j++){
                if((ar.get(i)+ar.get(j))%k==0){
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }
}

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {


        int result = Result3.divisibleSumPairs(6, 3, Arrays.asList(1,3,2,6,1,2));

        System.out.println(result);
    }
}
