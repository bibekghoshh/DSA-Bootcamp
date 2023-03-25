package Array;

import java.util.ArrayList;

public class UnionOFArrays {
    public static void main(String[] args) {
        int a[]={1,3,5,7};
        int b[]={2,7,9};
        
        ArrayList<Integer> ans =new ArrayList<Integer>();

       for (int i = 0; i < a.length; i++) {
         ans.add(a[i]);
       }
       for (int i = 0; i < b.length; i++) {
         ans.add(b[i]);
       }

       System.out.println(ans);
    }
}
