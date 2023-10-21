package SearchingAlgorithms;

public class BinarySearch {
    public  static  void main(String[] args){
        System.out.println("Binary Search Algorithm.");
        int[] arr = {-8,-7,-2,-1,0,12,15,19,22,29,54,67,89};
        int target = -1;
        int index = searchIndex(arr,target);
        System.out.println("element found at index : "+index);
    }
    static int searchIndex(int[] arr, int target){
        int start = 0; // start index of array
        int end = arr.length-1; // end index of array
        while(start<=end){
            // below code is use instead of (start+end)/2 because of integer storage issue for large number
            // both are same but in different formats
            int mid = start + (end-start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
