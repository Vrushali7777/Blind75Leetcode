import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]){
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l<r){
                int threeSum = a + nums[l] + nums[r];

                if (threeSum > 0){
                    r--;
                }
                else if(threeSum < 0){
                    l++;
                }
                else{
                    res.add(Arrays.asList(a, nums[l], nums[r]));

                    l++;
                    while (l < r && nums[l] == nums[l - 1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ThreeSum15 obj = new ThreeSum15();
        int[] nums = {-4,-2,2,-2,-2,0,1,2,0,-1,1,3};

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println("The triplets whose sum is 0: ");

        for(List<Integer> triplet : result){
            System.out.println(triplet);
        }
    }
}
