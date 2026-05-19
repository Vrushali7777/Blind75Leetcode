package CodesInJava;
public class MaxProdSubArray152 {
    public static int maxProdArray(int[] nums){
        int res = nums[0];

        int curMin = 1;
        int curMax = 1;

        for(int n :  nums){
            if(n==0){
                curMin = 1;
                curMax = 1;
                continue;
            }

            int tmp = curMax * n;
            curMax = Math.max(Math.max(n * curMax, n * curMin), n);  //as at a time Math.max() in java only takes 2 arguments we divide the three arguments into two as we have done here
            curMin = Math.min(Math.min(tmp, n * curMin), n);

            res = Math.max(Math.max(res, curMax), curMin);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1,4};
        System.out.println(maxProdArray(nums));

        int[] nums1 = {2,3,-1,0,4,6};
        System.out.println(maxProdArray(nums1));
        
    }
}
