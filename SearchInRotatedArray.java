import java.util.*;
public class SearchInRotatedArray {

    // solved by me linear search Time complexity = O(n)
    public static int SearchInArray(int[] nums, int target){
        for(int i = 0; i <= nums.length - 1; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }

    //solved by video Time complexity = O(logn)
    public static int search(int[] nums, int target){
        int l = 0; 
        int r = nums.length - 1;

        while (l<=r){
            int mid = (l + r) / 2;

            if (target == nums[mid]){
                return mid;
            }

            if(nums[l] <= nums[mid]){
                if (target > nums[mid] || target < nums[l]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            else {
                if(target < nums[mid] || target > nums[r]){
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3,4,5,6,7,8,9,0,1,2};
        System.out.println("Enter the number to search: ");
        int target = sc.nextInt();

        // System.out.println(SearchInArray(nums, target));
        System.out.println(search(nums, target));

    }
}
