package Array;

public class CeillingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 11;
        System.out.println("Ceiling of " + target);
        System.out.println("index : " + ceilling(arr, target));
        System.out.println("Value : " + arr[ceilling(arr, target)]);
    }

    static int ceilling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // this point start > end, so we can directly find next big number
        return start; // is equal to mid+1
    }

}
