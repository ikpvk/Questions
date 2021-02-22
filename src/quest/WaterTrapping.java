package quest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WaterTrapping {

    public static void main(String[] args) {

        // Creating building heights
        List<Integer> buildingHeights = new ArrayList<>();
        buildingHeights.add(1);
        buildingHeights.add(2);
        buildingHeights.add(0);
        buildingHeights.add(2);
        buildingHeights.add(1);
        System.out.println(buildingHeights);

        // Get the leftMax array
        List<Integer> leftMax = new ArrayList<>();
        Integer maxHeight = buildingHeights.get(0);
        for (int i = 0; i < buildingHeights.size(); i++) {
            if (maxHeight < buildingHeights.get(i)) {
                maxHeight = buildingHeights.get(i);
            }
            leftMax.add(maxHeight);
        }
        System.out.println(leftMax);

        // Get the righMax array
        List<Integer> rightMax = new ArrayList<>();
        maxHeight = buildingHeights.get(buildingHeights.size() - 1);
        for (int i = buildingHeights.size() - 1; i >= 0; i--) {
            if (maxHeight < buildingHeights.get(i)) {
                maxHeight = buildingHeights.get(i);
            }
            rightMax.add(maxHeight);
        }
        // Reversing this array for easier calculation
        Collections.reverse(rightMax);
        System.out.println(rightMax);

        // Calculating actual water collected
        Integer totalWater = 0;
        for(int i = 0; i < buildingHeights.size(); i++) {
            totalWater+= min(leftMax.get(i),rightMax.get(i)) - buildingHeights.get(i);
        }
        System.out.println(totalWater);
    }

    // Function to find min of 2 Integer values
    public static Integer min(Integer value1, Integer value2) {
        if(null!=value1 && null!=value2) {
            if(value1<value2){
                return value1;
            } else {
                return value2;
            }
        }
        return 0;
    }


}
