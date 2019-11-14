/*
Given an array of positive and negative integers, denoting different types of parentheses. 
The positive numbers  denotes opening parentheses of type  and negative number  denotes closing parentheses of type .
Open parentheses must be closed by the same type of parentheses. Open parentheses must be closed in the correct order, 
i.e., never close an open pair before its inner pair is closed (if it has an inner pair).
You have to find out the length of the longest subarray that is balanced.
 */
 
import java.util.Scanner;
import java.util.Stack;
import java.lang.Integer;
 
public class Balanced_para {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int arr[]=new int[num];
            for(int i=0;i<num;i++)
            {
                arr[i]=sc.nextInt();
            }
            Stack<Integer> ss=new Stack<>();
            int m=0,max=0;
            for(int i=0;i<num;i++)
            {
                if(ss.empty()==true || arr[ss.peek()]!=arr[i]*-1)
                {
                    ss.push(i);
                }
                else if(arr[i]<0 && arr[ss.peek()]==arr[i]*-1)
                {
                    
                    arr[ss.pop()]=0;
                    arr[i]=0;
                }
                else
                    ss.push(i);
               
            }
            for(int i=0;i<num;i++)
            {     
                if(arr[i]==0)
                {
                    m++;
                }
                else
                {
                    if(max<m)
                        {max=m;}
                    m=0;
                }
            }
             if(max<m)
                    max=m;
            System.out.println(max);        
    }
    
}
