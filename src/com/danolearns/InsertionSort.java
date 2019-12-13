package com.danolearns;

public class InsertionSort implements Sorting {
    @Override
    public int[] sortInt(int[] array) {

        for(int i=1;i<array.length;i++){
                    int temp = array[i];
                    int j;
                    for(j=i-1; j>=0 && array[j]>=temp; j--){
                     array[j+1]=array[j];
                 }
                    array[j+1]=temp;
        }
        return array;
    }
}
