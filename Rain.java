package rain;

import java.util.Arrays;
import java.util.Scanner;

public class Rain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            long water=0;

                long l1,r1;
                for(int i=0;i<n;i++)
                {
                    l1=arr[i];
                    r1=l1;
                    int j=i+1;
                    while(j<n && arr[j]<l1)
                    {
                        j++;
                    }
                    if(j<n)
                        r1=arr[j];
                    else 
                    {
                        r1=0;
                        for(int y=i+1;y<n;y++)
                        {
                            if(arr[y]>r1)
                            {
                                r1=arr[y];
                                j=y;
                            }
                        }
                    }
                    if(r1==0)
                        break;
                    
                    long minn=Long.min(l1,r1);
                    
                    for(int h=i+1;h<j;h++)
                    {
                        water=water+minn-arr[h];
                        
                    }
                    i=j-1;
                    
                    
                }
            
            System.out.println(water);
            
            test--;
        }
    }
    
}
