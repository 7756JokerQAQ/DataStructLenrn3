package lyc221103;

import java.util.Arrays;

public class Solution6 {
    static int[] hash = new int[10010];
    public int lengthLongestPath(String s) {

        Arrays.fill(hash, -1);
        int n = s.length(), ans = 0;
        for (int i = 0; i < n; ) {
            int level = 0; //用level来记录目录级数
            // 用while循环跳过制表符， 并增加层数
            while (i < n && s.charAt(i) == '\t' && ++level >= 0) i++;
            int j = i;
            boolean isDir = true; //判断是不是目录
            // 把文件和目录分开来判断
            // 最后一个一定要是文件， 前面一定要是目录
            // 如果有点的话， 说明不是目录

            // 当前文件或者目录（不换行的话） j计算当前深度的文件或目录的长度
            while (j < n && s.charAt(j) != '\n') {
                if (s.charAt(j++) == '.') isDir = false;
            }
            Integer cur = j - i; //cur为当前的长度
            // prev 代表的是上一层的之前的长度， 先通过level找到数组对应的位置
            Integer prev = level - 1 >= 0 ? hash[level - 1] : -1;
            // 因为i, j会比实际大 1 ， 所以长度正确， 加一加的是斜杆的长度
            Integer path = prev + 1 + cur;
            if (isDir) hash[level] = path; //如果是目录的话， 不计算长度， 长度算上一份文件的长度
            else if (path > ans) ans = path; //如果是文件的话，满足条件就更新长度
            i = j + 1; //j+1以后， 跳过了\n 换行符, 进行\t的判断
        }
        return ans;

    }

    public static void main(String[] args) {
        String str="dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        Solution6 solution6 = new Solution6();
        solution6.lengthLongestPath(str);
    }

}
