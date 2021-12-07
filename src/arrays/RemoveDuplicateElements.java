package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        int[] nums1 = new int[]{52,45,32,64,12,87,78,98,23,7};
        generate(5);
        //System.out.println(checkIfExist(nums1));
    }



    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                int toMove = (arr.length - i)-1;
                for(int j=arr.length-1; j> i; j--){
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 10;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 10){
                arr[i] = 0;
            }
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int index=m+n-1;

        while(p2>=0){
            if(p1>=0 && nums1[p1] > nums2[p2]) {
                nums1[index--] = nums1[p1--];
            }else
                nums1[index--] = nums2[p2--];
        }
    }


    public static int removeElement(int[] nums, int val) {
        int removeCount=0;
        int p2=nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums[p2] = nums[i];
                for(int j=i;j<p2;j++){
                    nums[j]=nums[++j];
                }
                removeCount++;
            }
        }
        return nums.length-removeCount;
    }

    public static void moveStuff(int[] nums){
        int temp = nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
    }

    public static void printStuff(int[] nums){
        System.out.println("["+0+"]: "+nums[0]);
        for(int i=0;i< nums.length-1;i++){
            System.out.println("["+(i+1)+"]: "+nums[i+1]);
        }
    }

    public static boolean checkIfExist(int[] arr) {
        if(arr.length == 0 || arr == null){
            return false;
        }


        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(i != j){
                    if(arr[j] == arr[i]*2 || (arr[j] == arr[i]/2 && arr[i]%2 == 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void reverseNumbers(int num){

        int remainder=0;
        int reverse=0;
        while(num>0){
            remainder = num%10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }

        System.out.println(reverse);
    }

    public static void moveZeroes(int[] nums) {
        int j=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == 0 && nums[i+1] != 0){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
                //j=i+1;
            }
        }
    }

    public static int heightChecker(int[] heights) {

        int[] newArray = heights.clone();
        Arrays.sort(newArray);

        // for(int i=0;i<newArray.length-1;i++){
        //     if(int[i] < int[i+1]){
        //         int temp = int[i];
        //         int[i] = int[i+1];
        //         int[i+1] = temp;
        //     }
        // }

        int incorrect = 0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] != newArray[i])
                incorrect++;
        }
        return incorrect;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int num = Math.abs(nums[i]);
            nums[num-1] = Math.abs(nums[num-1]) * -1;
        }



        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                missing.add(i+1);
        }

        return missing;
    }

    public static void sortArrays(int[] intArray){
        int temp = 0;

        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i] > intArray[j]){
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        //print sorted array
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();


        List<Integer> one = new ArrayList<>();
        one.add(1);

        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);

        if(numRows == 1){
            arr.add(one);
            return arr;
        }else if(numRows == 2){
            arr.add(one);
            arr.add(two);
            return arr;
        }else{
            arr.add(one);
            arr.add(two);

            for(int i=2;i<=numRows;i++){
                List<Integer> line = new ArrayList<>();
                line.add(1);
                List<Integer> prev = arr.get(i-1);
                for(int j=1;j<prev.size();j++){
                    line.add(prev.get(j-1) + prev.get(j));
                }
                line.add(1);
                arr.add(line);
            }

            return arr;
        }
    }
}
