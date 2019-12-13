package com.danolearns;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StableSelectionSort implements Sorting {
    @Override
    public int[] sortInt(int[] array) {
        {
            int minPosition;
            for(int i=0;i<array.length;i++){
                minPosition=i;
               for(int j=i;j<array.length;j++){
                  if(array[minPosition]>array[j]) minPosition=j;
               }
               int temp=array[minPosition];
               while(minPosition>i){
                   array[minPosition]=array[minPosition-1];
                   minPosition--;
               }
               array[i]=temp;
           }
        }
        return array;
    }

    /*@Override
    public int[] sortInt(int[] array) {
        int minPosition;
        for (int i = 0; i < array.length; i++) {
            minPosition = i;
            for (int j = 0 + i; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            int[] sendArray = new int[array.length-i];
            System.arraycopy(array,i,sendArray,0,array.length-i);
            sendArray = pushToFirst(sendArray,minPosition-i);
            System.arraycopy(sendArray,0,array,i,sendArray.length);
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
    public int [] pushToFirst(int []array, int index){
        if(index==0) return array;
        int[] tempArray= new int[array.length];
        tempArray[0]=array[index];
        boolean done=false;
        for(int i = 1;i<array.length;i++){
                if(done){
                    tempArray[i] = array[i];
                } else tempArray[i] = array[i-1];
                if(i==index) done=true;
            }
        return tempArray;
    }*/

}
