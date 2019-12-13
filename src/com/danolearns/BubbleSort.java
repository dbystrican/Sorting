package com.danolearns;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BubbleSort implements Sorting {

    public int[] nonOptimiyedSortInt(int[] array) {
        System.out.println(Arrays.toString(array));
        int sorted=1;
        int swap;
        while(sorted>0) {
            sorted=0;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                    System.out.println(Arrays.toString(array));
                    sorted++;
                }
            }
        }
        return array;
    }

    @Override
    public int[] sortInt(int [] array){
        System.out.println(Arrays.toString(array));
        int n = array.length;
        boolean sorted =false;
        for (int i = 0; i < n-1; i++) {
            sorted=true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println(Arrays.toString(array));
                    sorted=false;
                }
            }
            if(sorted=true) break;
        }
        return array;

    }
}
