package BinarySearch;

public class NearlySortedArray {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 40, 20, 50, 80, 70 };

        int start = 1;
        int end = arr.length - 2;
        int target = 70;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
            }
            if (arr[mid - 1] == target) {
                System.out.println(mid - 1);
            }
            if (arr[mid + 1] == target) {
                System.out.println(mid + 1);
            }
            if (target > arr[mid]) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }
    }
}
