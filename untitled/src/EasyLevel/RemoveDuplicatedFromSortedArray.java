package EasyLevel;

public class RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {

        int[] arrTest = {1,1,2,3,3,4,4,5,6,7,8};

        int k = removeDuplicates(arrTest);

        System.out.println("Number of unique elements: " + k);
    }
    private static int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
