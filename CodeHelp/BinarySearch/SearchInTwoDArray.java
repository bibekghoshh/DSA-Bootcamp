package BinarySearch;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=16;
        boolean ans=false;
        int row=nums.length;
        int col=nums[0].length;
        int start=0;
        int end=(row*col)-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            int rowIndex=mid/col;
            int colIndex=mid%col;
            int element=nums[rowIndex][colIndex];

            if(element==target)
            ans=true;
            if(element>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

       if(ans){
        System.out.println("Found");
       }else{
        System.out.println("Not Found");
       }
        
    }
}
