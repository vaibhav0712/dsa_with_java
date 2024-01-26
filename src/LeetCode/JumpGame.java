package LeetCode;
//https://leetcode.com/problems/jump-game/description/
public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2,0,0,1};
        System.out.println("jump game : "+jumpGame(arr));
    }
    static boolean jumpGame(int[] arr){
        if(arr.length < 2){
            return true;
        }
        // check if index+value is bigger then last index
        for(int j=0; j<arr.length; j++){

        }


        // if zero comes in array before last index it means the chain will break from that point
        // we cant move further from that point
        // let's code that first
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }
}
