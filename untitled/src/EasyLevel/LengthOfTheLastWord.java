package EasyLevel;

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        test("Hello World");
        test("   fly me   to   the moon  ");
        test("luffy is still joyboy");
        test("a");
        test("a   ");
    }

    private static void test(String s) {
        int result = lengthOfLastWord(s);
        System.out.println("\"" + s + "\" -> " + result);
    }

    private static int lengthOfLastWord(String s) {

        String[] stringList = s.split(" ");
        String lastWord = stringList[stringList.length - 1];
        char[] charArray = lastWord.toCharArray();
        return charArray.length;

    }
}