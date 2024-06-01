package src;

public class FirstOccurrenceInString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("sadbutsad", "but"));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || haystack.length() < needle.length() || !haystack.contains(needle)) return -1;
        int i = 0, j = needle.length();
        while (j < haystack.length()) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}

// 0    1   2   3   4   5   6   7   8
// s    a   d   b   u   t   s   a   d      =? sad
// i        j
//                          i        j
// sliding window approach with a window of size needle.length()