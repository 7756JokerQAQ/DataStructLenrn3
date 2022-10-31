package test02;

import java.util.Arrays;

public class Solution3 {
 /*   public boolean repeatedSubstringPattern(String s) {

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length()-1; i++) {
            sb.append(s.charAt(i));

            boolean k=check(s,sb,i+1);
            if(k){
                return true;
            }
        }
        return false;
    }

    private boolean check(String s, StringBuilder sb,int k){
        int q=s.length()/k;
        String temp= sb.toString();
        while (q>1){
            temp+=sb.toString();
            q--;
        }
        if(temp.length()==s.length()&&temp.equals(s)){
            return true;
        }
        return false;

    }*/

        public boolean repeatedSubstringPattern(String s) {
            return kmp(s);
        }
        public boolean kmp(String pattern) {
            int n = pattern.length();
            int[] fail = new int[n];
            Arrays.fill(fail, -1);
            for (int i = 1; i < n; ++i) {
                int j = fail[i - 1];
                while (j != -1 && pattern.charAt(j + 1) != pattern.charAt(i)) {
                    j = fail[j];
                }
                if (pattern.charAt(j + 1) == pattern.charAt(i)) {
                    fail[i] = j + 1;
                }
            }
            return fail[n - 1] != -1 && n % (n - fail[n - 1] - 1) == 0;
        }



    public static void main(String[] args) {
        String  s="abcabcabcabc";
        Solution3 solution3 = new Solution3();
        solution3.repeatedSubstringPattern(s);
    }
}
