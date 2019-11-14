/*
Given an array with n distinct elements, convert the given array to a reduced form where all elements are in range from 0 to n-1. 
The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is placed for second smallest element,
… n-1 is placed for largest element.
 */
package reducedsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ReducedSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int arr1[]=new int[n];
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
               
                arr[i]=sc.nextInt();
                arr1[i]=arr[i];
            }
            Arrays.sort(arr);
            
           for(int i=0;i<n;i++)
           {
               for(int j=0;j<n;j++)
               {
                   if(arr[i]==arr1[j])
                   {
                       arr1[j]=i;
                       break;
                   }
               }
           }
            for(int i=0;i<n;i++)
                System.out.print(arr1[i]);
            System.out.println("");
            
            test--;
        }
    }
    
}
