package quest.longestpalindromesubstring;

public class Solution {
    public int getMaxPalindromeLength(String value, int left, int right) {

        if(null==value || value.trim().length()<1 || left < 0 || right>=value.length()) {
            return 0;
        }

        while(left>=0 && right<value.length() && value.charAt(left)==value.charAt(right)) {
            left--;
            right++;
        }

        return right-left-1;
    }
}
