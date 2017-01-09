package io.caojun221.interview.string;

public final class ReverseString {

    private static String reverse(String str) {

        char[] orig = str.toCharArray();

        int l = 0, r = orig.length - 1;
        while (l < r) {
            if (!isAlphabet(orig[l])) {
                l++;
            } else if (!isAlphabet(orig[r])) {
                r--;
            } else {
                char c = orig[r];
                orig[r] = orig[l];
                orig[l] = c;
                l++;
                r--;
            }
        }
        return new String(orig);
    }

    private static boolean isAlphabet(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }

    /**
     * http://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
     */
    public static void main(String[] args) {
        System.out.println(reverse("Ab,c,de!$"));
    }
}
