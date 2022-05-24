import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result2 {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int minScore = scores.get(0);
        int maxScore = scores.get(0);

        int minCount = 0;
        int maxCount = 0;

        for(int i=1;i<=scores.size()-1;i++){
            if(scores.get(i) < minScore){
                minScore = scores.get(i);
                minCount++;
            }else if(scores.get(i) > maxScore){
                maxScore = scores.get(i);
                maxCount++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);
        return result;
    }

}

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {

        List<Integer> scores = Stream.of("10 5 20 20 4 5 2 25 1".replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result2.breakingRecords(scores);

        System.out.println(result);
    }
}
