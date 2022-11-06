package lyc221101;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        String s1="";
        for (int i = 0; i < word1.length; i++) {
            s+=word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            s1+=word2[i];
        }

        if(s.equals(s1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String s[]={"ab","c"};
        String s1[]={"a","bc"};
        Solution solution = new Solution();
        solution.arrayStringsAreEqual(s,s1);
    }
}
