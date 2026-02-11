package EasyLevel;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        test(nums, 5);  // expected 2
        test(nums, 2);  // expected 1
        test(nums, 7);  // expected 4
        test(nums, 0);  // expected 0
    }

    private static void test(int[] nums, int target) {
        int result = searchInsert(nums, target);
        System.out.println("Target: " + target + " -> Position: " + result);
    }

    private static int searchInsert(int[] nums, int target) {
        if (nums[nums.length - 1] < target) return nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < target && nums[i] > target) return i;
        }
        return 0;
    }


}


