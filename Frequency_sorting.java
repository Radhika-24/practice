/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency_sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * * <h1>Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.
     * </h1>
 * @author abc
 */
public class Frequency_sorting {

    /**
    *@param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws NumberFormatException, IOException{ 
        // TODO code application logic here
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			    sortByFreq(arr, size);
			    System.out.println();
			n--;
		}
    }
     /**
      * this function receives elements in an array.
      * Hashmap with with value as frequency is created.
      * hashmap is sorted by value in DESCENDING ORDER.
      * Elements of hashmap are printed as per frequency.
      * @param arr list of elements
      * @param num number of elements
      */
    public static void sortByFreq(int arr[], int num)
    {
       HashMap<Integer, Integer> hmm=new HashMap<>();
       //Create Hashmap
        for(int i=0;i<num;i++)
        {
            if(hmm.containsKey(arr[i]))
            {
                hmm.replace(arr[i], hmm.get(arr[i])+1);
            }
            else
            {
                hmm.put(arr[i], 1);
            }
        }
        //sort Hashmap
        //Create List
        List<Map.Entry<Integer, Integer>> list=new LinkedList<>(hmm.entrySet());
        //Sort List
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>()
        {
            public int compare(Map.Entry<Integer,Integer> a1,Map.Entry<Integer,Integer> a2)
            {
                return(a1.getValue()).compareTo(a2.getValue());
            }
        }.reversed());
        //Output
        for(Map.Entry<Integer,Integer> aa:list)
        {
            int h=aa.getValue();
            for(int i=0;i<h;i++)
                System.out.print(aa.getKey()+" ");
        }
    }
    
}
