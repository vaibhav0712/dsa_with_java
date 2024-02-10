package DSA100;

import java.util.ArrayList;
import java.util.Arrays;

public class BitManipulation {
    public static void main(String[] args) {
        // odd or even number
        boolean is_even = isEven(10);

        // 1. find ith bit
        int find_bit = findBit(13,1);  // 2nd position (0-based indexing)

        // 2. set ith bit
        int set_bit = setBit(13,1);  // 2nd position (0-based indexing)

        // 3. clear ith bit
        int clear_bit = clearBit(15,1);

        // 4. count the number of set bits
        int count = countBit(10);
        System.out.println(count);

        // 5. swap two numbers
        int a = 10,b=5;
        System.out.println(a + " " + b);
        a = a ^ b; // XOR
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);


        // 6. find 1 non-repeating element in given array where every element in two times repeating
        int[] arr1 = {1,6,8,2,6,1,2};
        System.out.println("non repeating element : "+ nonRepeating1(arr1));

        // 7. find 2 non-repeating element in given array where evey element is two time repeating
        int[] arr2 = {1,6,8,2,1,2,7,6};
        System.out.println("non repeating element : "+ Arrays.toString(nonRepeating2(arr2)));

        // 8. find 1 non-repeating element in array where every element is 3 times repeating.
        int[] arr3 = {1,2,1,5,2,2,1,5,5,4,12,12,4,12,4,11};
        System.out.println("non repeating element : " + nonRepeating3(arr3));
    }
    static int nonRepeating3(int[] arr){
        int res = 0;
        int[] bitArray  = new int[32]; // 0-31 pos, integer representation of any number is in 32bit
        // update bitArray
        for(int i:arr){
            int currPos = 0;
            while(i != 0){
                if((i & 1) != 0){
                    bitArray[currPos]++;
                }
                i = i >> 1;
                currPos++;
            }
        }
        System.out.println(Arrays.toString(bitArray));
        // now find answer in bitArray
        int power = 0;
        for(int bit:bitArray){
            res += ( bit % 3 ) * (int)Math.pow(2,power);
            power++;
        }
        return res;
    }

    static int[] nonRepeating2(int[] arr){
        int res = 0;
        int a,b;
        for(int i:arr){
            res = res ^ i;
        }
        // now the res would be like res = a ^ b
        // create two buckets based on first set bit(lsb)
        ArrayList<Integer> bucket1 = new ArrayList<>();
        ArrayList<Integer> bucket2 = new ArrayList<>();

        int posOfSetBit = findPosOfSetBit(res);
        for(int i:arr){
            if(findBit(i,posOfSetBit) == 1){
                bucket1.add(i);
            }else{
                bucket2.add(i);
            }
        }

        // XOR res with both buckets to find answer
        int temp = res;
        for(int i:bucket1){
            temp = temp ^ i;
        }
        a = temp;

        temp = res;
        for(int i:bucket2){
            temp = temp ^ i;
        }
        b = temp;

        return new int[] {a,b};
    }
    static int findPosOfSetBit(int num){
        int pos = 0;
        while(num != 0){
            if((num & 1) != 0){
               return pos;
            }
            num = num >> 1;
            pos++;
        }
        return -1;
    }
    static int nonRepeating1(int[] arr){
        int res = 0;
        for(int i:arr){
            res = res ^ i;
        }
        return  res;
    }
    static boolean isEven(int num){
        // check last bit of number
        return (num & 1) == 0;
    }
    static int findBit(int num, int pos){
        int mask = 1 << pos;
        if((num & mask) == 0){
            return 0;
        }
        return 1;
    }
    static int setBit(int num, int pos){
        int mask = 1 << pos;
        return num | mask;
    }
    static int clearBit(int num, int pos){
        int mask = 1 << pos;
        mask = ~ mask;
        return num & mask;
    }
    static int countBit(int num){
        int counter = 0;

//        1. Method
//        while(num != 0){
//            if((num & 1) != 0){
//                counter++;
//            }
//            num = num >> 1;
//        }
//        return counter;

        // 2. Method
        while(num != 0){
            counter++;
            num = num&(num-1);
        }
        return counter;
    }
}
