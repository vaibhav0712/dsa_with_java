package DSA100;

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
