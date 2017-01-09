package io.caojun221.interview.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * http://www.geeksforgeeks.org/word-break-problem-using-backtracking/
 */
public final class WorkBreak {

    public static void main(String[] args) {

        String[] strs = { "ilikesamsungmobile", "ilikeicecreamandmango"};

        String[] dic = {
                "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go",
                "mango", "and"
        };
        Set<String> set = new HashSet<>(Arrays.asList(dic));
        for (String str : strs) {
            breakWord(set, str, "");
        }
    }

    private static void breakWord(Set<String> dic, String str, String sentence) {

        if (str.length() == 0) {
            System.out.println(sentence);
        }
        for (int i = 0; i <= str.length(); i++) {
            if (dic.contains(str.substring(0, i))) {
                breakWord(dic, str.substring(i, str.length()), sentence + ' ' + str.substring(0, i));
            }
        }
    }
}
