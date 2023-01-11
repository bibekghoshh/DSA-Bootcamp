package Ghosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatirxReshape {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=2,c=4;
        int[][] a;
                a=matrixReshape(mat,r,c);
        System.out.println(Arrays.deepToString(a));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {

        int[] arr=new int[r*c];
        int d=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(d==r*c) break;
                arr[d]=mat[i][j];
                d++;
            }
        }

        //System.out.println(Arrays.toString(arr));
        int[][] fin=new int[r][c];
        int b=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(b==r*c) break;
                fin[i][j]=arr[b];
                b++;
            }
        }
       // System.out.println(Arrays.deepToString(fin));
      return fin;
    }
}
