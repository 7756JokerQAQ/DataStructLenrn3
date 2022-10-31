package test02;

public class Solution2 {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        //首相让a的长度大于b的长度这样b才能包含进去
        while (sb.length() < b.length() && ++ans > 0) sb.append(a);
        //当遍历结束后 我们需要在末尾再附加一个a的长度此时的ant先不进行++操作
        sb.append(a);
        //然后看字符串b是否能在index中找到 不能的话直接返回-1它找到的为b字符串第一个字母出现的下标
        int idx = sb.indexOf(b);
        if (idx == -1) return -1;
        //如果此时的idx+b的长度 比加一个字符串后的长度还要大说明 最后加的a字符串也参与了 所以返回ans+1
        //反之则说明没有
        return idx + b.length() > a.length() * ans ? ans + 1 : ans;
    }

    public static void main(String[] args) {
       String a = "a", b = "aa";
        Solution2 solution2 = new Solution2();
        solution2.repeatedStringMatch(a,b);
    }
}
