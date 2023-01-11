package recursion.arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3,4,5};
        int target=8;
        int ans=Search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    private static int Search(int[] arr, int target, int s, int e) {
        if(s>e) return -1;

        int mid=s+(e-s)/2;

        if(target==arr[mid]) return mid;

        if(arr[s]<arr[mid]){
            if(target<=arr[mid] && target>=arr[s]){
                return Search(arr,target,s,mid-1);
            }else {
                return Search(arr,target,mid+1,e);
            }
        }
        if(target>=arr[mid] && target<=arr[e]){
            return Search(arr,target,mid+1,e);
        }
        return Search(arr,target,s,mid-1);
    }
}

