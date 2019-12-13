package com.danolearns;

public class DivideAndConquer {
    public static void main(String [] args){
        int [] array = {0,1,2,3,4,5,6,7,8};
        int looking = 0;
        //testBinarySearch(array);
        binarySearch(array,-1);



    }
    private static void testBinarySearch(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.println(i+" "+array[i]+" "+binarySearch(array,array[i]));
    }
    //what if it isnt on mid position
    private static int binarySearch(int[] array, int searching){
        int beg = 0;
        int end = array.length-1;
        int mid = beg + (end - beg) / 2;
        while(true){
            if(searching == array [mid])
                return mid;
            else if(searching>array[mid]){
                beg = mid;
                mid = beg + (end - beg) / 2;
            }else if(searching<array[mid]){
                end= mid;
                mid = beg + (end - beg) / 2;
            }
            if( end==mid   || beg==mid )  {
                    if(mid<0 && array[mid-1]==searching){
                        return mid-1;
                    }
                    else if(mid<array.length && array[mid+1]==searching) {
                        return mid + 1;
                    }
            }if (end == mid && mid == beg) return -1;
        }
    }
}
