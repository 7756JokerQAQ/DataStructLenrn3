package test06;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int type = 0;
        if (ruleKey == "type") {
            type = 0;
        } else if (ruleKey == "color") {
            type = 1;
        } else {
            type = 2;
        }
        int count = 0;
        for (List<String> res :
                items) {
            if (res.get(type).equals(ruleKey)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String >> res= new LinkedList<>();
        List<String> temp1=new LinkedList<>();
        temp1.add("phone");
        temp1.add("blue");
        temp1.add("pixel");
        res.add(temp1);
       List<String> temp=new LinkedList<>();
       temp.add("computer");
       temp.add("silver");
       temp.add("lenovo");
       res.add(temp);
        List<String> temp2=new LinkedList<>();
        temp2.add("phone");
        temp2.add("gold");
        temp2.add("iphone");
        res.add(temp2);
        Solution2 solution2 = new Solution2();
        solution2.countMatches(res,"color","silver");

    }
}
