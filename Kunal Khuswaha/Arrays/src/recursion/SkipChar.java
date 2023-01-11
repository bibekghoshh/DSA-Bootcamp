package recursion;

public class SkipChar {

    static char s = 'a';

    public static void main(String[] args) {

        String str = "baccad";

        System.out.println(Skip(str, 0));
    }

    public static String Skip(String str, int i) {
        if (i == str.length()) return str;
        if (s == str.charAt(i)) {
            if (i == str.length() - 1) {
                str = str.substring(0, i);
            } else {
                str = str.substring(0, i) + str.substring(i + 1);
            }
        }
        return Skip(str, i + 1);
    }
}
