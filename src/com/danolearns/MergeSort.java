package com.danolearns;

public class MergeSort implements Sorting{

    @Override
    public int[] sortInt(int[] array) {
        int[] arrayL; int [] arrayR;
            if (array.length % 2 == 0) {
                arrayL = new int[array.length / 2];
                arrayR = new int[array.length / 2];
            } else {
                arrayL = new int[(array.length / 2) + 1];
                arrayR = new int[array.length / 2];
            }

        System.arraycopy(array, 0, arrayL, 0, (array.length)-(array.length/2));
        System.arraycopy(array, (array.length/2)+1, arrayR,0 , array.length/2);//(array.length)-(array.length/2));
        int [][] arrayOfArray=new int[(array.length/2)+1][];
        for (int i =0;i<arrayOfArray.length;i++ ){

        }
        return new int[0];
    }

}
