package nuts;
/*Given a set of N nuts of different sizes and N bolts of different sizes.
There is a one-one mapping between nuts and bolts. Match nuts and bolts efficiently.
Comparison of a nut to another nut or a bolt to another bolt is not allowed. 
It means nut can only be compared with bolt and bolt can only be compared with nut to see which one is bigger/smaller.*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Nuts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            String arr[]=new String[n];
            ArrayList<String> hm=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.next();
                hm.add(arr[i]);
            }
            Collections.sort(hm);
            
            
           for( String a:hm)
            {
                System.out.print(a+" ");
            }
            System.out.println("");
            test--;
        }
    }
    
}
