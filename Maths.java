/*
 Raman loves Mathematics a lot. One day his maths teacher gave him an interesting problem.

He was given an array 'A' consisting of 'n' integers, he was needed to find the maximum value of the following expression:

|Ai - Aj| + |i - j|

where, 0<= i,j <n and Ai, Aj are the Array elements.
 */
package maths;

import java.util.Scanner;

public class Maths {
  public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
       while(test>0)
       {
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++)
           {
               arr[i]=sc.nextInt();
           }
           int max=-1;
           for(int i=0;i<n;i++)
           {
               for(int j=i;j<n;j++)
               {
                   int a=Math.abs(arr[i]-arr[j])+Math.abs(i-j);
                   if(a>max)
                   {
                       max=a;
                   }
               }
           }
           System.out.println(max);
           test--;
       }
    }
    
}
