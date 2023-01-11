package Ghosh;

import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index ={0,1,2,2,1};

        int l=nums.length;
        int[] target=new int[l];

        for(int i=0;i<l;i++){
            if(target[i]!=0){

                target[index[i]] = nums[i];
                target[index[i+1]]=target[index[i]];
            }else {
                target[index[i]] = nums[i];
            }
        }
        System.out.println(Arrays.toString(target));
    }
}
