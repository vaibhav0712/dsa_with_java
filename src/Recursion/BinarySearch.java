package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9,12};
        int start = 0;
        int end = arr.length-1;
        int target = 10;
        int res  = binarySearch(arr,start,end,target);
        System.out.println("element at index : "+res);
    }
    static int binarySearch(int[] arr, int start, int end,int target){
        if(start > end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(target > arr[mid]){
            // search on right side of array
            return binarySearch(arr,mid+1,end,target);
        }
        else{
            // search on left side of array
            return binarySearch(arr,start,mid-1,target);
        }
    }
}
