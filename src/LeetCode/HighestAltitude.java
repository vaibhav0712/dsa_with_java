package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans = largestAltitude(gain);
        System.out.println("Highest Altitude : "+ ans);
    }
    static int largestAltitude(int[] gain){
        int gainSize = gain.length;
        int[] altitude = new int[gainSize+1];
        int highestAltitude = Integer.MIN_VALUE;

        // creating altitude array
        altitude[0] = 0;
        for(int i=0; i<gainSize; i++){
            altitude[i+1] = gain[i] + altitude[i];
        }
        // search for max altitude
        for(int ele:altitude){
            if(ele>highestAltitude){
                highestAltitude = ele;
            }
        }
        return highestAltitude;
    }
}
