package Search;

public class PositionInAnSortedArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,12,14,16,17,19,26,27,36,37,38,57,67,68,95,123};
        int target=38;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target) {
        int start = 0;
        int end = 1;
        int ans=-1;
        while (target !=arr[start]) {
            if (target >= arr[start] && target <= arr[end]) {
                while (start < end) {
                    int mid = start + (end - start) / 2;
                    if (target > arr[mid]) {
                        start = mid + 1;
                    } else if(target<arr[mid]){
                        end = mid - 1;
                    }else {
                        ans=start;
                    }
                }
            } else {
                start = end + 1;
                end = (start * 2)+1;
            }
        }
        return start;
    }
}
