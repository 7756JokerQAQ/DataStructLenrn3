package lyc221101;

public class Solution4 {
    public int[] constructRectangle(int area) {
        int k=(int) Math.sqrt(area);
        if(k*k==area){
            return new int[]{k,k};
        }
        int temp1=1;
        for (int i = 1; i <= k; i++) {
            if(area%i==0){
                temp1=i;
            }
        }
        return new int[]{area/temp1,temp1};
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] ints = solution4.constructRectangle(6);
        for (int k:
             ints) {
            System.out.println(k);
        }

    }
}
