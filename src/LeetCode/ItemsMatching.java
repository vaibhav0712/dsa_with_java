package LeetCode;
import java.util.ArrayList;

// https://leetcode.com/problems/count-items-matching-a-rule/description/
public class ItemsMatching {
    public static void main(String[] args) {
        String ruleKey = "type";
        String ruleValue = "phone";
        int count = itemsMatching(ruleKey,ruleValue);
        System.out.println("Answer : "+count);
    }
    static int itemsMatching(String ruleKey,String ruleValue){
        // Question,

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);
        System.out.println("question : "+listOfLists);


        // Solution,
        if("type".equals(ruleKey)){
            return countMatching(listOfLists,0,ruleValue);
        } else if ("color".equals(ruleKey)) {
            return countMatching(listOfLists,1,ruleValue);
        }
        else{
            return countMatching(listOfLists,2,ruleValue);
        }
    }
    static int countMatching(ArrayList<ArrayList<String>> listOfLists, int index, String ruleValue){
        int counter = 0;
        for(ArrayList<String> items:listOfLists){
            if(items.get(index).equals(ruleValue)){
                counter++;
            }
        }
        return counter;
    }
}
