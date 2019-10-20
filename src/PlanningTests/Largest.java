package PlanningTests;

import javax.management.RuntimeErrorException;

public class Largest {
    static int largest(int[] list) {
        if(list.length==0) {
            throw new RuntimeException("Empty list!");
        }
        int i = 0;
        int max = list[i];
        for(i=1;i<list.length;i++) {
            if(list[i]>max)
                max = list[i];
        }
        return max;
    }
}
