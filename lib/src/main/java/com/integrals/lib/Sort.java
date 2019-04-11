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
           }

    public void bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if (array[j] > array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public void selectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
       int n1=middle-left+1;
       int n2=right-middle;
       int[] leftArray=new int[n1];
       int[] rightArray=new int[n2];

       for(int i=0;i<n1;i++){
           leftArray[i]=array[left+i];
       }
       for(int j=0;j<n2;j++){
           rightArray[j]=array[middle+j+1];
       }

       int i=0;
       int j=0;
       int k=left;
       while (i<n1&&j<n2){
           if(leftArray[i]<=rightArray[j]){
               array[k]=leftArray[i];
               i++;
           }else{
               array[k]=rightArray[j];
               j++;
           }
           k++;
       }
       while(i<n1){
           array[k]=leftArray[i];
           i++;
           k++;
       }
       while (j<n2){
           array[k]=rightArray[j];
           j++;
           k++;
       }
    }

    public void mergeSort(int[] array,int left,int right)
    {
      if(left<right){
      int middle=(left+right)/2;
      mergeSort(array,left,middle);
      mergeSort(array,middle+1,right);
      merge(array,left,middle,right);
      }
    }


    private int partition(int array[],int low,int high){
        int pivote=array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(array[j]<=pivote){
            i++;
            //swap array[i] and array[j]
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;

            }
        }
        //swap array[i+1]and array[high]
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;

        return i+1;
    }

    public void quickSort(int[] array,int low, int high){
        if(low<high){
            int pi=partition(array,low,high);
            quickSort(array,low,pi-1);
            quickSort(array,pi+1,high);
        }
    }

    public void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\n");
        }
    }
}
