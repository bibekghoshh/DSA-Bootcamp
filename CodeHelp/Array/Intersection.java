package Array;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]={3,4,9,10};

        ArrayList<Integer> ans=new ArrayList<>();

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(b[i]==a[j]){
                    ans.add(b[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
