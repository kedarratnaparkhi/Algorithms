import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result6{

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr){
        int[] temp = new int[20];
        List<Integer> send = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            temp[arr.get(i)]--;
        }

        for(int i=0;i<brr.size();i++){
            temp[brr.get(i)]++;
        }

        for(int i=0;i<temp.length;i++){
            if(temp[i]>0){
                send.add(i);
            }
        }
        return send;
    }

    public static int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i=0;i<arr.length-1;i++){
            arr[nums[i]]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] < 1){
                return i;
            }
        }
        return 0;
    }
}



public class MissingNumbers {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(7,2,5,3,5,3);
        List<Integer> brr = Arrays.asList(7,2,5,4,6,3,5,3);
        int[] arra = {3,0,1};

        List<Integer> result = Result6.missingNumbers(arr, brr);

        int result2 = Result6.missingNumber(arra);

        System.out.println(result);

    }
}
