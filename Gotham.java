/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gotham;

import java.util.Scanner;
import java.util.Stack;

/**
 *<h1>Gotham has been attacked by Joker . Bruce Wayne has deployed automatic machine gun at each tower of Gotham.
All the towers in Gotham are in straight line.
You are given no of towers 'n' followed by height of 'n' towers.
For every tower(p), find the height of the closest tower (towards the right), greater than the height of tower(p).
Now , Print sum of all such heights (mod 1000000001).

Note : If for a tower(k) , no such tower exsits then take its height as 0.</h1>
 * @author abc
 */
public class Gotham {

    /**
     * <b>Algo for problem</b><br>
     * take input.<br>
     * for every element:<br>
     * <b>while</b> element is greater the top of stack
     * add to sum<br>
     * pop stack<br>
     * push element on stack.<br>
     * output <b>sum</b>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            test--;
            int num=sc.nextInt();
            int arr[]=new int[num];
            Stack<Integer> st=new Stack();
            int sum=0;
            for(int i=0;i<num;i++)
            {
                arr[i]=sc.nextInt();
            }
            st.push(arr[0]);
            for(int i=1;i<num;i++)
            {
                    while(!st.isEmpty() && arr[i]>st.peek())
                    {
                        sum=(sum+arr[i])%1000000001;
                        st.pop();
                    }
                    st.push(arr[i]);
                
            }
            System.out.println(sum);
        }
    }
    
}
