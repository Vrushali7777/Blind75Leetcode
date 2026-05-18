public class MaxSubArray53 {
    public static int maxSubarray(int[] nums){
        int maxSub = nums[0];   //initializing maxSum of maxSubarray to first element of input array
        int curSum = 0;

        for(int n: nums){
            if (curSum < 0){
                curSum = 0;
            }
            curSum += n;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));
    }
}
