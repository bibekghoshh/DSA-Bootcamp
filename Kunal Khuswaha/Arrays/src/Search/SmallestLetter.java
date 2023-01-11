package Search;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] arr={'e','e','e','e','e','e','n','n','n','n'};
        char target='e';
        System.out.println(CeilNum(arr,target));
    }
    static char CeilNum(char[] letters,char target){
        int start=0;
        int end=letters.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<letters[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start];
    }
}
