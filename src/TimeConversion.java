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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String outputString = "";
        String ampm = s.substring(8,s.length());
        String[] splits = s.substring(0,8).split(":");

        if(ampm.equals("PM")){
            if(Integer.parseInt(splits[0]) == 12){
                outputString = s.split("PM")[0];
            }else{
                outputString = (Integer.parseInt(splits[0])+12)+":"+splits[1]+":"+splits[2];
            }
        }else{
            if(Integer.parseInt(splits[0]) == 12){
                outputString = "00"+":"+splits[1]+":"+splits[2];
            }else{
                outputString = (splits[0])+":"+splits[1]+":"+splits[2];
            }
        }
        return outputString;
    }
}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        String s = "07:05:45PM";

        String result = Result.timeConversion(s);
        System.out.println(result);
    }
}
