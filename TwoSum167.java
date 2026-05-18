import java.util.*;

public class TwoSum167 {
    public static int[] twoSum(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        while (l < r){
            int curSum = nums[l] + nums[r];

            if (curSum > target){
                r--;
            }
            else if(curSum < target){
                l++;
            }
            else{
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TwoSum167 t = new TwoSum167();
        int[] nums = {1,4,5,7,8,9,10,15};

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(t.twoSum(nums, target)));
    }
}
