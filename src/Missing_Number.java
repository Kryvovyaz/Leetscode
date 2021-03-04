import java.util.ArrayList;
import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
    }

    public static int missingNumber(int[] nums) {
        int n_elements_sum = nums.length * (nums.length + 1) / 2;
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
            sum += nums[i];

        return n_elements_sum - sum;
    }
}
