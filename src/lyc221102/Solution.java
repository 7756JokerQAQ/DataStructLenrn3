package lyc221102;

public class Solution {
    public int[] bestCoordinate(int[][] towers, int radius) {
        if(towers.length==1){
            if(towers[0][2]==0){
                return new int[]{0,0};
            }
            return new int[]{towers[0][0],towers[0][1]};
        }
        int []temp2=new int[towers.length];
        for (int i = 0; i < towers.length; i++) {
            temp2[i]=towers[i][2];
        }
        for (int i = 0; i < towers.length-1; i++) {
            for (int j = i+1; j < towers.length; j++) {
               int m= (int)Math.sqrt(Math.pow((towers[i][0]-towers[j][0]),2)+Math.pow((towers[i][1]-towers[j][1]),2));

                if(m>radius){
                    continue;
                }

                towers[i][2]+=temp2[j]/(1+m);
                towers[j][2]+=temp2[i]/(1+m);

            }
        }
        //开始搜寻最大值
        int Max=-1;
        int flagNum[]=new int[2];
        for (int i = 0; i < towers.length; i++) {
            if(towers[i][2]>Max){
                flagNum[0]=towers[i][0];
                flagNum[1]=towers[i][1];
                Max=towers[i][2];
            }else  if(towers[i][2]==Max){
                if(flagNum[0]> towers[i][0]||((flagNum[0]==towers[i][0])&&flagNum[1]<towers[i][1])){
                    continue;
                }
                flagNum[0]=towers[i][0];
                flagNum[1]=towers[i][1];
            }
        }
        return flagNum;
    }

    public static void main(String[] args) {
        int [][]towers = {{1,2,5},{2,1,7},{3,1,9}};
        Solution solution = new Solution();
        System.out.println(solution.bestCoordinate(towers, 2));
    }
}
