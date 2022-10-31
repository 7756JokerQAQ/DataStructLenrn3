package test05;

public class Solution2 {
    public int hammingDistance(int x, int y) {
      int z=x^y;
      int cnt=0;
      while (z!=0){
          if((z&1)==1)cnt++;
          z>>=1;

            // 0000001
            // 1000000
            // 1000001

        }
      return cnt;
    }

    public static void main(String[] args) {
        int x=1,y=100000;
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.hammingDistance(x,y));
    }
}
