/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nearestsmallestnum;

import java.util.Scanner;

/**
 *Given an array of integers, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.
 * @author abc
 */
public class NearestSmallestNum {

    /**
     * <b>Algo of problem</b><br>
     * 1. Take input.<br>
     * 2. For every element, e:<br>
     * Traverse backwards<br>
     * if current element(ce) less than e<br>
     * Result[e]=ce<br>
     * 3. Output
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            test--;
            int num=sc.nextInt();
            int arr[]=new int[num];
            int res[]=new int[num];
            for (int i=0;i<num;i++)
            {
                arr[i]=sc.nextInt();  //input
                res[i]=-1;
            }
            
            for(int i=1;i<num;i++)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[i]>arr[j])
                    {
                        res[i]=arr[j];
                        break;
                    }
                }
            }
            for(int i=0;i<num;i++)
            System.out.print(res[i]+" ");
            System.out.println("");
        }
    }
    
}
