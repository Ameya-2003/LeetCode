class Solution {
    public boolean isPalindrome(int x) {
        long revnum = 0;
        int use = x;
        while(x>0)
        {
            revnum = revnum * 10 + x%10;
            x/=10;
        }
        if (use == revnum){
            return true;
        }
        else{
            return false;
        }
    }
}
