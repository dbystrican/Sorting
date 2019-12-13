package com.danolearns;

public class ArrayUtils {
    public static int[] combineArrays(int[] array1,int[] array2){
        int length = array1.length + array2.length;
        int[] result = new int[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}
