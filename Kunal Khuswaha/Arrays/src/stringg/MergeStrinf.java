package stringg;

public class MergeStrinf {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }

   static public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String ans="";

        while(i<word1.length() && j<word2.length()){
            ans=ans+word1.charAt(i++);
            ans=ans+word2.charAt(j++);
        }
        return ans;
    }
}
