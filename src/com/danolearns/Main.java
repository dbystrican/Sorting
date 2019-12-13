package com.danolearns;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(new BubbleSort().sortInt(new int[]{1,3,2,4,5,6,7,8})));
        //System.out.println(Arrays.toString(new SelectionSort().sortInt(new int[]{10,9,8,7,6,5,4,3,3})));
        System.out.println(Arrays.toString(new int[]{3,10,0,12,9,8,7,78,7,6,5,4,3,2,1}));
        System.out.println(Arrays.toString(new StableSelectionSort().sortInt(new int[]{3,10,0,12,9,8,7,78,7,6,5,4,3,2,1})));
        //System.out.println(Arrays.toString(new InsertionSort().sortInt(new int[]{3,10,0,12,9,8,7,78,7,6,5,4,3,2,1})));
        System.out.println(Arrays.toString(new MergeSort().sortInt(new int[]{3,10,0,12,9,8,7,78,7,6,5,4,3,2,1})));
        //System.out.println(Arrays.toString(new int[]{10,9,8,7,6,5,4,3,2,1}));
        //System.out.println(Arrays.toString(new StableSelectionSort().pushToFirst(new int[]{10,9,8,7,6,5,4,3,2,1},2)));

    }
}
