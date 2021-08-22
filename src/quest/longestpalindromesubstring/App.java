package quest.longestpalindromesubstring;

public class App {
    public static void main(String[] args) {
        String value = "cabba";
        int start=0, end = 0;

        Solution solution = new Solution();
        for(int i=0; i< value.length()-1; i++) {
            int len1 = solution.getMaxPalindromeLength(value,i,i);
            int len2 = solution.getMaxPalindromeLength(value,i,i+1);
            int maxLen = Math.max(len1,len2);
            if(maxLen>(end-start-1)) {
                start = i - ((maxLen-1)/2);
                end = i + (maxLen/2);
            }
        }

        System.out.println("Longest substring of "+value+" is : "+value.substring(start, end+1));

    }
}
