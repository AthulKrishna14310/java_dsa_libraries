package com.integrals.lib.Helper;

import com.integrals.lib.Sort;

public class SortImplementation {

    public void implement(){
        int[] arr=new int[5];


        arr[0]=4;
        arr[1]=3;
        arr[2]=10;
        arr[3]=2;
        arr[4]=11;
        print("Before Sorting \n");
        printArray(arr);

        print("Bubble Sorted");
        new Sort().bubbleSort(arr);
        printArray(arr);

        arr[0]=4;
        arr[1]=3;
        arr[2]=10;
        arr[3]=2;
        arr[4]=11;
        print("Insertion Sort");
        new Sort().insertionSort(arr);
        printArray(arr);

        arr[0]=4;
        arr[1]=3;
        arr[2]=10;
        arr[3]=2;
        arr[4]=11;
        print("Merge Sort");
        new Sort().mergeSort(arr,0,arr.length-1);
        printArray(arr);

        arr[0]=4;
        arr[1]=3;
        arr[2]=10;
        arr[3]=2;
        arr[4]=11;
        print("Selection Sort");
        new Sort().selectionSort(arr);
        printArray(arr);


        arr[0]=4;
        arr[1]=3;
        arr[2]=10;
        arr[3]=2;
        arr[4]=11;
        print("Quick Sort");
        new Sort().quickSort(arr,0,arr.length-1);
        printArray(arr);

    }
    public void print(String ch){
        System.out.println(ch);
    }
    public void printArray(int[] array){
        for(int i=0;i<array.length;i++)
            print(array[i]+"");
    }

}
