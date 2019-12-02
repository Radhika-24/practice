package maximum.intervals.overlap;

import java.util.Scanner;

/**
 *<h3>Consider a big party where a log register for guest’s entry and exit times is maintained. Find the time at which there are maximum guests in the party. Note that entries in register are not in any order.</h3>
 * @author abc
 */
public class MaximumIntervalsOverlap {

    /**
     * Take input.<br>
     * sort arrival array.
     * for each arrival{<br>
     * 1. add new guest.<br>
     * 2. Check and delete if any guest left between last arrival.<br>
     * 3.Update Max guest count.<br>
     * }<br>
     * Print output.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            test--;
            int num=sc.nextInt();
            int arr[]=new int[num];   //arrival times
            int dep[]=new int[num];   //departure time
            for(int i=0;i<num;i++)
                arr[i]=sc.nextInt();
            for(int i=0;i<num;i++)
                dep[i]=sc.nextInt();
            for(int i=0;i<num;i++)      //Sort according to arrival times.
            {
                for(int j=i;j<num;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                        t=dep[i];
                        dep[i]=dep[j];
                        dep[j]=t;
                    }
                }
            }
            int time=arr[0],t=0;
            int g=0,gu=0;
            for(int i=0;i<num;i++)
            {
                time=arr[i];
                g++;                //guest arived
                for(int j=0;j<i;j++)
                {
                    if(dep[j]!=0 && dep[j]<time)    //guest left
                    {
                        dep[j]=0;
                        g--;                    //decrease count.
                    }
                }
                if(g>gu)
                {
                    gu=g;           //store max value
                    t=time;
                }
            }
            System.out.println(gu+" "+t);
        }
    }
    
}
