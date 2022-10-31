package test06;

public class Solution4 {


    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        int  times=(minutesToTest / minutesToDie) + 1;
        while (Math.pow(times,pigs)<buckets){
            pigs++;
        }
        return pigs;
    }
}
