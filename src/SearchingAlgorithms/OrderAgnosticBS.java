package SearchingAlgorithms;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascending = {-7, -6, -1, 0, 10, 20, 45, 220, 331};
        int[] descending = {331, 220, 45, 20, 10, 0, -1, -6, -7};
        int target = 0;
        System.out.println("descending : "+orderAgnosticBS(descending, target));
        System.out.println("ascending : "+orderAgnosticBS(ascending, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] <= arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] > target) {
                    // check left side of mid
                    end = mid - 1;
                } else {
                    // check right side of mid
                    start = mid + 1;
                }
            } else { // if descending order
                if (arr[mid] < target) {
                    // check left side of mid
                    end = mid - 1;
                } else {
                    // check right side of mid
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
