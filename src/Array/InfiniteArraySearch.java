package Array;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target  = 10;
        int start = 0;
        int end = 1;
        // for infinite array search start & end
        while(arr[end]<target){
            // double window size and move start & end
            int newStart = end+1; // 2,6,
            end = 2*(end-start+1)+end; // 5,
            start = newStart; // 2,
        }

        int result = binSearchIndex(arr,target,start,end);
        System.out.println(result);
    }
    static int binSearchIndex(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
