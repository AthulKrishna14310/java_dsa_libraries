package com.integrals.lib;
import com.integrals.lib.Helper.DijistrasShortestPathImplementation;

import java.lang.*;
import java.util.Scanner;


class MyClass
{

    public static void main (String[] args) throws java.lang.Exception {
        int[] arr=new int[5];
                arr[0]=4;
                arr[1]=3;
                arr[2]=10;
                arr[3]=2;
                arr[4]=11;
    new Sort().quickSort(arr,0,arr.length-1);
    new Sort().print(arr);

    }
}