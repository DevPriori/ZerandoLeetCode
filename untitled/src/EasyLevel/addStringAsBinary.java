package EasyLevel;

public class addStringAsBinary {
    public static void main(String[] args) {
        String test1 = "1010";
        String test2 = "1010";
        String test3 = "1100";
        String test4 = "1011";

        System.out.println(addBinary(test2, test3));

    }

    private static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if(i>=0) sum += a.charAt(i--)-'0';
            if(j>=0) sum += b.charAt(j--)-'0';

            sb.append(sum%2);
            carry = sum/2;
        }

        return sb.reverse().toString();
    }
}