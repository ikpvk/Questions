package quest.extremeprinting;

public class Solution {
    public void printExtremes(int[] arr){
        if(null==arr || arr.length==0) {
            return;
        }

        int length = arr.length;
        int leftP = 0;
        int rightP = length-1;
        while(leftP<rightP) {
            System.out.print(arr[leftP]+ " " + arr[rightP]+ " ");
            leftP++;
            rightP--;
        }
        if(leftP==rightP) {
            System.out.print(arr[leftP]);
        }
    }
}
