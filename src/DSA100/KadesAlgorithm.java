package DSA100;

public class KadesAlgorithm {
    public static void main(String[] args) {
        // max sum sub array
        int[] arr = {5,-4,-2,6,2,-1};
        int currSum = 0;
        int maxSum = 0;
        for(int i:arr){
            currSum += i;
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                // reset currSum
                currSum = 0;
            }
        }
        System.out.println("Max sum : "+ maxSum);
    }
}
