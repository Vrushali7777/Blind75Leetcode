import java.util.Arrays;

public class ProductExceptSelf238 {
    public int[] productExceptself(int[] nums){
        int[] res = new int[nums.length];  //initializing array as same length as the input array nums

        // initializing result array with 1 as defualt value 
        for(int i = 0; i < nums.length; i++){
            res[i] = 1;
        }

        int prefix = 1;  // as before the first element in the array there won't be any prefix value so, we are intializing 1

        // computing prefix Products 
        for(int i = 0; i <nums.length; i++){
            res[i] = prefix; // updating values in res with particular prefixes
            prefix *= nums[i]; // finding prefix values for the folowing element in the array
        }

        int postfix = 1; // as after the last element in the array there won't be any postfix value so, we are intializing 1
        // traversing array from backwards to find postfix products
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] *= postfix;  // multiplying the prefix values present in the res values with the postfix values to find final output
            postfix *= nums[i];  // finding postfix for the particular value
        }
        return res;
    }

    public static void main(String[] args) {
        ProductExceptSelf238 pes = new ProductExceptSelf238();

        int[] nums = {2,3,4,5};

        System.out.println(Arrays.toString(pes.productExceptself(nums)));


    }
}
