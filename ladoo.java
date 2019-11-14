/*
 Given an array, For each element find the value of nearest element to the right which is having frequency greater than as that of current element. 
If there does not exist an answer for a position, then print '-1'
Constraints
20 points: T<=100 1<=N<=10^2 1<=Ai<=10^2
80 points: T<=100 1<=N<=10^5 1<=Ai<=10^5
*/
 
import java.util.HashMap;
import java.util.Scanner;
 
public class Frequency_of_right {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int num=sc.nextInt();
            int arr[]=new int[num];
            int res[]=new int[num];
            HashMap<Integer, Integer> hm=new HashMap<>();
            for(int i=0;i<num;i++)
            {
                res[i]=-1;
                arr[i]=sc.nextInt();
                if(hm.containsKey(arr[i]))
                {
                    int x=hm.get(arr[i]);
                    hm.remove(arr[i]);
                    hm.put(arr[i],x+1);
                
                }
                else
                    hm.put(arr[i], 1);
            }
            for(int i=0;i<num;i++)
            {
                int a=hm.get(arr[i]);
                for(int j=i+1;j<num;j++)
                {
                    if(a<hm.get(arr[j]))
                    {
                        res[i]=arr[j];
                        break;
                    }
                }
            }
            for(int i=0;i<num;i++)
            {
                System.out.print(res[i]+" ");
            }
            System.out.println("");
            test--;
        }
    }
    
}
Language: Java
