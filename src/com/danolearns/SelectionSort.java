package com.danolearns;

public class SelectionSort implements Sorting{
    @Override
    public int[] sortInt(int[] array) {
        int minPosition;
        int temp;
        for(int i = 0; i < array.length; i++) {
            minPosition=i;
            for (int j = 0+i; j < array.length; j++) {
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }
            }
            temp=array[i];
            array[i]=array[minPosition];
            array[minPosition]=temp;
        }
        return array;
    }
}
