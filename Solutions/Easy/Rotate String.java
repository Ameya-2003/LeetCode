class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() == goal.length())
        {
           String s1 = (s + s);
           return s1.contains(goal);
    
        }
        return false;
    }
}
