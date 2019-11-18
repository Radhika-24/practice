/*
Given arrival and departure times of all trains that reach a railway station. 
Your task is to find the minimum number of platforms required for the railway station so that no train waits.
 */
package trains;

import java.util.Scanner;
public class Trains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int dep[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                dep[i]=sc.nextInt();
            }
            int pd[]=new int[n];
            int plat=0;
            for(int i=0;i<n;i++)
            {
                int j=0;
                
                    while(pd[j]>arr[i])
                        j++;
                
                if(pd[j]==0)
                {
                    plat++;
                }
                pd[j]=dep[i];
            }
            System.out.println(plat);
            test--;
        }
    }
    
}
