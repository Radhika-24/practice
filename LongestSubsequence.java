package longestsubsequence;

import java.util.Arrays;
import java.util.Scanner;

/**
 *<h1>Given an array arr[] of positive integers. 
*Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, 
*the consecutive numbers can be in any order.</h1>
 */
public class LongestSubsequence {

    /**
     * <h1> This method takes input from user and returns the longest possible consecutive subsequence</h1> 
     *Take input.<br>
     * find max element to create hash array.<br>
     * create hash array with value 1 for elements existing in array.<br>
     * check hash array for consecutive numbers(if hash[i]==1)<br>
     * update counter.
     * return max consecutive length.<br>
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int num=sc.nextInt();
            int arr[]=new int[num];
            for(int i=0;i<num;i++)
            {
                arr[i]=sc.nextInt();        //Input array
            }
            int m=0;
            for(int i=0;i<num;i++)
            {
                if(m<arr[i])                //Finding max element
                    m=arr[i];
            }
            int hash[]=new int[m+1];
            for(int i=0;i<num;i++)
            {
                hash[arr[i]]=1;             //Hash having value 1 if element exists
            }
            int c=1,max=1;
            for(int i=0;i<m;i++)
            {
                if(hash[i]==1 && hash[i+1]==1)  //test fro consecutive
                {
                    c++;
                }
                else
                {
                    if(c>max)
                        max=c;
                    c=1;
                }
            }

            if(max<c)
                max=c;                      //chck max
            System.out.println(max);
            
            test--;
        }
    }
    
}
