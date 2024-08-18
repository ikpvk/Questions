package quest.uniquearrayelement;

public class Solution {
    public void findUniqueElement(int arr[]) {
        if(null==arr || arr.length==0) {
            return;
        }
        int uniqueElement = 0;
        for(int i=0; i< arr.length; i++) {
            uniqueElement = uniqueElement ^ arr[i];
        }
        System.out.println(uniqueElement);
    }
}
