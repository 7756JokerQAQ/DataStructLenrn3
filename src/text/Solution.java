package text;

import java.util.ArrayList;
/*
0
01
0110
01101001
0110100110010110
 */


public class Solution {
    public int kthGrammar(int n, int k) {
        return find(n, k - 1);

    }

    private int find(int N, int K) {
        if (N == 1) {
            return 0;
        }
        int res = 0;
        //首先得到前n-1排的那个数字
        int num = find(N - 1, K / 2);
        if (K % 2 == 0) {
            if (num == 1) res = 1;
            else res = 0;
        } else {
            if (num == 1) res = 0;
            else res = 1;
        }
        return res;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.kthGrammar(4,7);
    }


}
