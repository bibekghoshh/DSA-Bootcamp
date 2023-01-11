package Ghosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
       int[] num={1,2,0,0};
       int k=34;
       List<Integer> ans=sum(num,k);
        System.out.println(ans);
    }
    static List<Integer> sum(int[] num, int k){
        int i=num.length-1;
        List<Integer> arr=new ArrayList<>();
        if(i>=0 || k>0){
            if(i>=0){
                arr.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }else{
                arr.add(k%10);
                k=k/10;
            }
            i--;
        }
        Collections.reverse(arr);
        return arr;
    }
}
