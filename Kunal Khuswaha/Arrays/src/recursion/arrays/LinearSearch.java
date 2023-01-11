package recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,2,4,18,3,9,6};
        int target=3;
        System.out.println(Search(arr,target,0,new ArrayList<Integer>()));

    }
    static ArrayList<Integer> Search(int[] a,int target,int index,ArrayList<Integer> list){
        if(index==a.length) return list;

        if(target==a[index])
            list.add(index);

        return Search(a,target,index+1,list);
    }
}
