
import java.util.Arrays;

// problem description: https://neetcode.io/problems/products-of-array-discluding-self/question
class ProductOfArrayExceptSelf {

    // [1, 2, 4, 6]
    // [2*4*6, 1*4*6, 1*2*6, 4*2*1]
    public int[] productExceptSelf(int[] nums) {
        int[] solution = new int[nums.length];
        int[] prefix;
        int[] suffix;

        for (int i = 0; i < nums.length; i++) {
            int mul = 1;

            // suffix
            suffix = Arrays.copyOfRange(nums, i + 1, nums.length);
            mul *= multiply(suffix);

            // prefix
            if (i > 0) {
                prefix = Arrays.copyOfRange(nums, 0, i);
                mul *= multiply(prefix);
            }

            solution[i] = mul;
        }

        return solution;
    }

    public int multiply(final int[] nums) {
        int mul = 1;
        for (int num : nums) {
            mul *= num;
        }
        return mul;
    }
}
