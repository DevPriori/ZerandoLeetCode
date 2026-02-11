package EasyLevel;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("Number of elements not equal to " + val + ": " + k);
    }
    private static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
