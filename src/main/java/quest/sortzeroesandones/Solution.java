package quest.sortzeroesandones;

import java.util.Arrays;

public class Solution {
    public void sortZeroOne(int arr[]) {
        if(null == arr || arr.length==0) {
            return;
        }
        System.out.println("Before sorting");
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
        System.out.println();
        int countZero = 0;
        for(Integer i : arr) {
            if(i==0) {
                countZero++;
            }
        }
        for(int i=0; i<countZero; i++) {
            arr[i] = 0;
        }
        for(int i=countZero; i< arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println("After sorting");
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
    }
}
