package EasyLevel;

public class LogestCommonPrefix {
    public static void main(String[] args) {
        String[] arrTest = {"flower","flow","flight"};
        String[] arrTest1 = {"tower","towel","town"};
        System.out.println(longestCommonPrefixMethod(arrTest));
    }
    private static String longestCommonPrefixMethod(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];

        for(int i = 0; i < strs.length ; i++){

            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length() -1);
            }

            if(prefix.isEmpty())return "";
        }
        return prefix;
    }
}
