package test06;

public class Solution9 {
    public String convertToTitle(int columnNumber) {
        //26*26+25=701
    String res="";
    while (columnNumber>0){
        columnNumber--;
        int temp=(columnNumber%26);
        res=(char)(temp+'A')+res;
        columnNumber/=26;

    }
    return res;
    }

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();

        System.out.println(solution9.convertToTitle(701));
    }

}
