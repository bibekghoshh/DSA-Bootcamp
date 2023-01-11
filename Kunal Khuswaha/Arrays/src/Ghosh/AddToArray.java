package Ghosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
        int[] A={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};

            int k=516;
        int N = A.length;
        int cur = k;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
       // return ans;

        System.out.println(ans);

    }
}
