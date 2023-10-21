package Array;
import java.util.Scanner;
import java.util.Arrays;

public class Basic{
    public static void main(String[] args){
        System.out.println("Basics of Array.");
        // declaration
        int[] numbers;
        // initialization
        numbers = new int[5];
        System.out.println("default int array value : " +numbers[0]); // default : int array assign with 0.
        // here new keyword create array object in heap.
        // array might not be continues in java because of jvm.

        String[] names = new String[10];
        System.out.println("default Strain array values : "+names[0]); // default : String array assign with null.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter five number seperated with space : ");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


        //******** MultiDimension Array **********//
        int[][] matrix = new int[2][2]; // row x col
        // int[][] matrix = new int[2][]; -> row must specified
        int[][] matrix2D  = {{1,2},{3,4}};

        for(int[] row:matrix2D)
        {
            System.out.println(Arrays.toString(row));
        }

        int arr[] = {1,4,9,10,23,3};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1,int index2){
           int temp = arr[index1];
           arr[index1] = arr[index2];
           arr[index2] = temp;
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
