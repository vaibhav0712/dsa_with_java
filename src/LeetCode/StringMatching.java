package LeetCode;

public class StringMatching {
    public static void main(String[] args) {
        String haystack= "sadbutsad";
        String needle = "sad";
        System.out.println(findIndex(haystack,needle));
    }
    static int findIndex(String haystack, String needle){
        // Check for edge cases
        if (needle == null || needle.length() == 0) {
            return 0; // Empty needle is always found at index 0
        }

        int haystackLength = haystack.length(); // 9
        int needleLength = needle.length(); // 3

        // Iterate through the haystack string
        for (int i = 0; i <= haystackLength - needleLength; i++) { // 9-3 = 6
            // Check if substring from current index matches needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Return the index of the first occurrence
            }
        }

        return -1; // Needle not found in haystack
    }
}
