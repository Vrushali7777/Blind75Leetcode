package CodesInJava;
public class FindMinInRotatedSortedArray153 {
    public static int findMin(int[] nums){
        int res = nums[0];
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            if (nums[l] < nums[r]){ // if the cuurent positions are already sorted
                res = Math.min(res, nums[l]);
                break;
            }

            int m = (l + r) / 2;  // calculating middle if the array is sorted but rotated
            res = Math.min(res, nums[l]);

            if (nums[m] >= nums[l]){ // if middle is greater than the number on the left this means that minimum number will be in the right of the middle in the array
                l =  m + 1;  // therefore update the left pointer to the right of the middle pointer
            }else{// if middle is smaller than the number on the left this means that minimum number will be in the left of the middle in the array
                r = m - 1;   // therefore update the right pointer to the left of the middle pointer
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,1};
        System.out.println(findMin(nums));
    }
}
