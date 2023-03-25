package TwoDArray;

import java.util.Arrays;

public class TransePose {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};

        int[][] result=new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length; j++) {
                result[j][i]=a[i][j];
            }
        }
        System.out.println("Before");
        System.out.println(Arrays.deepToString(a));
        System.out.println("After");
        System.out.println(Arrays.deepToString(result));
    }
}
