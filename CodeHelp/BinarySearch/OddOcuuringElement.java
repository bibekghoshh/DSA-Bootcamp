package BinarySearch;

public class OddOcuuringElement {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 8, 8,90, 90,3 };

        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(start==end){
                ans=start;
                break;
            }
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    start=mid+1;
                } else {
                    end= mid-1;
                }
            }
        }
        System.out.println(arr[ans]);
    }
}
