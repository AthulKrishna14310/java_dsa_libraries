package com.integrals.lib;

public class Sort {

    public void insertionSort(int[] array){
            for(int i=1;i<array.length;i++){
                int key=array[i];
                int j=i-1;
                while(j>=0&&array[j]>key){
                    array[j+1]=array[j];
                    j=j-1;
                }
                array[j+1]=key;
            }
            print(array);
        }


    private void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            LeftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            RightArray[j] = array[middle + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while (i <n1 && j <n2) {
            if (LeftArray[i] <= RightArray[j]) {
                array[k] = LeftArray[i];
                i++;
            } else {
                array[k] = RightArray[j];
                j++;
            }
            k++;

        }

       while(i<n1){
        array[k]=LeftArray[i];
        i++;
        k++;

       }
       while(j<n2){
        array[k]=RightArray[j];
        j++;
        k++;
       }

    }

    public void mergeSort(int[] array,int left,int right)
    {
      if(left<right){


      }
    }



    public void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\n");
        }
    }
}
