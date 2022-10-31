package test04;

public class Solution2 {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int pre=0,qre=s.length()-1;
        while (pre<=qre){
            if(s.charAt(pre++)!=s.charAt(qre--)){
                return false;
            }
        }
        return true;
    }
}
