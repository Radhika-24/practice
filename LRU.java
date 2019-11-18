/*
In operating systems that use paging for memory management, 
page replacement algorithm are needed to decide which page needs to be replaced when the new page comes in. 
Whenever a new page is referred and is not present in memory, the page fault occurs and Operating System replaces one of the existing pages with a 
newly needed page. 
Given a sequence of pages and memory capacity, your task is to find the number of page faults using Least Recently Used (LRU) Algorithm.
 */
package lru;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class LRU {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int num=sc.nextInt();
            int arr[]=new int[num];
            for(int i=0;i<num;i++)
            {
                arr[i]=sc.nextInt();
            }
            int mem=sc.nextInt();
                int page=0;
                Queue<Integer> st=new LinkedList<Integer>();
                int m=0;
            for(int i=0;i<num;i++)
            {
                if(st.contains(arr[i]))
                {
                   st.remove(arr[i]);
                   st.add(arr[i]);
                }
                else
                {
                    page++;
                    if(m<mem)
                    {
                        st.add(arr[i]);
                        m++;
                    }
                    else
                    {
                        st.remove();
                        st.add(arr[i]);
                        m++;
                    }
                }
            
            }
            System.out.println(page);
            
            test--;
        }
    }
    
}
