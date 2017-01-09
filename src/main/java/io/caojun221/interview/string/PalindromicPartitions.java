package io.caojun221.interview.string;

/**
 * http://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/
 */
public final class PalindromicPartitions {

    public static void main(String[] args) {
        String[] input = { "nitin", "geeks" };

        for (String str : input) {
            findPartition(str, "");
        }
    }

    private static void findPartition(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
        }
        for (int i = 1; i <= str.length(); i++) {
            if (isPalindromic(str.substring(0, i))) {
                findPartition(str.substring(i, str.length()), result + ' ' + str.substring(0, i));
            }
        }
    }

    private static boolean isPalindromic(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
