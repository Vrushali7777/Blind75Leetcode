package CodesInJava;
import java.util.HashSet;

public class ContainsDuplicates217 {
    public boolean containsDuplicates(int[] nums){
        HashSet<Integer> hashset = new HashSet<>();

        for(int n: nums){
            if(hashset.contains(n)){
                return true;
            }
            hashset.add(n);
        }

        // traditional for loop
        /*for (int i = 0; i < nums.length; i++) {

    int n = nums[i];

    if (hashset.contains(n)) {
        return true;
    }

    hashset.add(n);
} */
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicates217 cd = new ContainsDuplicates217();
        int[] nums = {1,2,3,1,2,5,6,3};
        System.out.println(cd.containsDuplicates(nums));
    }
}
