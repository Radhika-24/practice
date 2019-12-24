/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordbreak2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.<br>

Return all such possible sentences.<br>

For example, given<br>
s = "snakesandladder",<br>
dict = ["snake", "snakes", "and", "sand", "ladder"].<br>

A solution is ["snakes and ladder",<br>
           "snake sand ladder"].<br>
 * @author abc
 */
public class WordBreak2 {
    
    /**
     * <b>Solution</b><br>
     * 1.Input Dictionary.<br>
     * 2.Split Dictionary on Space.<br>
     * 3.Input String.<br>
     * while(!queue.isempty())<br>
     * {<br>
     * Starting from 1st letter:<br>
     * {<br>
     * Split string and check if it exists in dictionary.<br>
     * add to queue.
     * if(string is not empty)<br>
     * update result and add remaining str on queue<br>
     * else
     * Update result array<br>
     * }<br>
     * }<br>
     * Sort the results alphabetically<br>
     * output<br>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            test--;
            int n=sc.nextInt();
            sc.nextLine();
            String d=sc.nextLine();
            String dict[]=d.split("\\s+");//dictionary
            String strin=sc.nextLine();//test string
            Arrays.sort(dict);
            String result[]=new String[n];
            int s=0;
            Queue<String> st=new LinkedList<>();
            
            Queue<String> res=new LinkedList<>();
            st.add(strin);
            res.add("");
            while(!st.isEmpty())
            {
                String str=st.remove();
                String rer=res.remove();
                for(int i=0;i<=str.length();i++)
                {
                    //System.out.println(str);
                    String aa=str.substring(0,i);
                    if(Arrays.binarySearch(dict, aa)>=0)
                    {//System.out.println(aa);
                        if(i==str.length())
                        {
                            result[s]=rer+" "+aa;
                            s++;
                        }
                        else
                        {
                            res.add(rer+" "+aa);
                            st.add(str.substring(i,str.length()));
                        }
                    }
                }
               // System.out.println(res);
            }
            
            if(s>0)
            {
                //Arrays.sort(result);
                for(int i=0;i<s;i++)
                {
                    for(int j=i+1;j<s;j++)
                    {
                        if(result[i].compareTo(result[j])>0)
                        {
                            String t=result[i];
                            result[i]=result[j];
                            result[j]=t;
                        }
                    }
                }
                for(int i=0;i<s;i++)
                System.out.print("("+result[i].trim()+")");
            }
            else 
                System.out.println("Empty");
            System.out.println("");
        }
    }
    
}
