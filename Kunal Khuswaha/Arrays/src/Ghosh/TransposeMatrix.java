package Ghosh;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
            int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        int n=matrix.length;
        int m=matrix[0].length;
        int[][] tran=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                tran[j][i]=matrix[i][j];

            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(tran[i][j]+" ");
            }
        }

    }
}
