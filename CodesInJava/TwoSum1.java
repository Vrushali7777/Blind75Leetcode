package CodesInJava;
import java.util.*;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int diff = target - n;

            if(prevMap.containsKey(diff)){
                return new int[] {prevMap.get(diff), i};
            }
            prevMap.put(n, i);
        }
        return new int[] {};  // if no solution is found return empty array
    }

    public static void main(String[] args) {
        TwoSum1 ts = new TwoSum1();
        int[] nums = {2,1,5,3};
        int target = 4;
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));

        // System.out.println(ts.twoSum(nums, target));
        /*This prints something like: [I@6d06d69c
        Because: Java prints the reference (memory address) of the array, not its contents. */
    }
}
