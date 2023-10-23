package Array;
import java.util.Arrays;
//https://leetcode.com/problems/flipping-an-image/
public class FlippingImage {
    public static void main(String[] args) {
        int[][] img = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] img2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for(int[] r:img2){
            System.out.println(Arrays.toString(r));
        }
        int[][] result = flip(img2);
        System.out.println("Result : ");
        for(int[] r:result){
            System.out.println(Arrays.toString(r));
        }

    }
    static int[][] flip(int[][] img){
        for(int[] row:img){
            // flip horizontally
            int start = 0;
            int end = row.length-1;
            while(start <= end){
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                start++;
                end--;
            }
            // invert
            for(int i=0;i<row.length;i++){
                // bitwise complement operation
                row[i] ^= 1;
            }
        }
        return img;
    }
}
