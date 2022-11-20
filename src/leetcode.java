import java.util.LinkedList;

public class leetcode {
    public static void main (String args[]){
        String s ="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        LinkedList ll = new LinkedList();
        for(int i=0; i<s.length();i++){
            if(!ll.contains(s.charAt(i))){
                ll.add(s.charAt(i));
            }
        }
        return ll.size();
    }
}
