package test07;



import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    //本题采用回溯算法
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        char[] chars = s.toCharArray();
        df(chars,0,res);
        return res;
    }

    private void df(char[] chars, int index, List<String> res) {
        if(index==chars.length){
            res.add(new String(chars));
            return;
        }
        df(chars,index+1,res);
        if(Character.isLetter(chars[index])){
           // chars[index]= (char) (chars[index]-32);
            chars[index]= (char) (chars[index]^(1<<5));
            df(chars,index+1,res);
        }
    }

    public static void main(String[] args) {
        String s="1a2b";
        Solution2 solution2 = new Solution2();
        solution2.letterCasePermutation(s);
    }

}
