package EasyLevel;

public class TwoSum {
    static void main() {
        int[] nums = {1,10,2,5,78,8};
        int target = 23;

        twoSum(nums, target);

    }

    private static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };

                }
            }
        }
        return new int[] {};
    }
}
