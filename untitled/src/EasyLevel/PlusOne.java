package EasyLevel;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        test(new int[]{1, 2, 3});
        test(new int[]{4, 3, 2, 1});
        test(new int[]{9});
        test(new int[]{9, 9, 9});
        test(new int[]{0});
    }

    private static void test(int[] digits) {
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;

    }
}

