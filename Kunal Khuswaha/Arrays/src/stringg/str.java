package stringg;

import java.util.Arrays;

public class str {
    public static void main(String[] args) {
        String a="i love leetcode";

        String[] words=a.split(" ");

        for (String w: words){
            System.out.println(w);
        }
    }
}
