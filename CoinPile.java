/*
There are N piles of coins each containing  Ai (1<=i<=N) coins.  
Now, you have to adjust the number of coins in each pile such that for any two pile, 
if a be the number of coins in first pile and b is the number of coins in second pile then |a-b|<=K. 
In order to do that you can remove coins from different piles to decrease the number of coins in those piles 
but you cannot increase the number of coins in a pile by adding more coins. Now, given a value of N and K, 
along with the sizes of the N different piles you have to tell the minimum number of coins to be removed in order to satisfy the given condition.
Note: You can also remove a pile by removing all the coins of that pile.
 */
package coinpile;

import java.util.Arrays;
import java.util.Scanner;

public class CoinPile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
                {
                    int n=sc.nextInt();
                    int k=sc.nextInt();
                    int arr[]=new int[n];
                    int arr1[]=new int[n];
                    for(int i=0;i<n;i++)
                    {
                        arr[i]=sc.nextInt();
                        arr1[i]=arr[i];
                    }
                    int remove=Integer.MAX_VALUE;
                    Arrays.sort(arr);
                    Arrays.sort(arr1);
                    for(int i=0;i<n;i++)
                        System.out.print(arr[i]+" ");
                    int hh=0;
                    for(int v=0;v<n;v++)
                    {int rem=hh;System.out.print(rem+" ");
                        for(int i=v;i<n;i++)
                        {
                            for(int j=i+1;j<n;j++)
                            { 
                                int m=Math.abs(arr[i]-arr[j]);
                                if(m>k)
                                {//System.out.println(v+" "+i+" "+j);
                                    int h=m-k;
                                    if(arr[i]>arr[j])
                                        arr[i]-=h;
                                    else
                                        arr[j]-=h;
                                    
                                    rem=rem+h;
                                }
                            }
                        }
                        hh+=arr[v];
                        for(int i=v;i<n;i++)
                            arr[i]=arr1[i];
                        remove=Math.min(rem,remove);
                        System.out.println(rem);
                    }
                    System.out.println(remove);
                    test--;
                }
    }
    
}
