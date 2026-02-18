package EasyLevel;

public class FindIndexFirstOccurrenceString {
    public static void main(String[] args) {

        String hayStackTest1 = "hello";
        String hayStackTest2 = "java";

        //
        String needleTest1 = "ll";
        String neddleTest2 = "ava";

        System.out.println(strStr(hayStackTest1, needleTest1));

    }

    private static int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needleLenth = needle.length();

        if(hayLength < needleLenth) return -1;

        for (int i = 0; i <= hayLength - needleLenth; i++) {
        int j = 0;

            while(j < needleLenth && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == needleLenth){
                return i;
            }

        }
        return -1;
    }
}
