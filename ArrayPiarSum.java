package arraypiarsum;

import java.util.Scanner;

/**
 *<h1> Given an array of integers and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k. </h1>
 * @author abc
 */
public class ArrayPiarSum {

    /**
     * Take input.<br>
     * If number of elements is odd. print false and exit.<br>
     * else{<br>
     * for each element i find corresponding element such that sum s divisible by 'k'.<br>
     * mark them both zero.<br>
     * check through the array if any non-zero element left. <br>
     * print "true" if no element left.<br>
     * else print "False"<br>
     * }<br>
     * @param args the command line arguments
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
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            if(num%2!=0)
            {
                System.out.println("False");
                continue;
            }
            int count=0;
            for(int i=0;i<num;i++)
            {
                if(arr[i]==0)
                    continue;
                for(int j=0;j<num;j++)
                {
                    if(arr[j]==0 || i==j)
                        continue;
                    if((arr[i]+arr[j])%k==0)
                    {
                        arr[i]=0;arr[j]=0;
                        break;
                    }
                }
            }
            for(int i=0;i<num;i++)
            {  
                if(arr[i]!=0)
                {
                    count=-1;
                    break;
                }
            }
            if(count==0)
                System.out.println("True");
            else
                System.out.println("False");
            test--;
        }
    }
    
}
