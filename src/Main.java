import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int [] arr = {10,5,78,1,2,6,9,5,0,4}; // 8 element in array
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        int n = 100111001;
        int counter = 0;
        while(n != 0){
            if((n & 1) != 0){
                counter++;
            }
            n = n >> 1;
        }
        System.out.println(counter);

    }
    static void bubbleSort(int []arr){
        // if n element outer loop run only n-1
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            System.out.println("Pass " + (i+1));
            // inner loop only run n-1-i times
            for(int j=0; j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static  void selectionSort(int [] arr){
        // if n element outer loop run only n-1 times
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            System.out.println("Pass : " + (i+1));
            // every pass we set min element to its position
            int indexMin;
            indexMin = i;
            // run from i+1 to len-1
            // 0,1,2,3,4
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j; // set new indexMin
                }
            }
            // swap elements
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }


    static void insertionSort(int[] arr){
        // run loop from index i=1 to last index is n-1
        int n = arr.length;
        // outer loop till last index
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i;
            while(j>0 && arr[j-1] > key){
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = key;
        }
    }

}