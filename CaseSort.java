/*Given a string S consisting of uppercase and lowercase characters.
The task is to sort uppercase and lowercase letters separately such that if the ith place in the original 
string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.*/

package casesort;

import java.util.*;
import java.lang.*;
import java.io.*;
//Position this line where user code will be pasted.
class CaseSort {
    
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new solve().caseSort(str);
    	        System.out.println(sortedStr);
    	    }
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}


/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static String caseSort(String str) {
        // Your code heresout   
       
        int n=str.length();
        char a[]=new char[n];
        char A[]=new char[n];
        int m=0,M=0;
        char st[]=str.toCharArray();
        for(int i=0; i<n;i++)
        {
            if(st[i]>64 && st[i]<91)
            {
                A[M]=st[i];
                M++;
            }
            else if(st[i]>96 && st[i]<123)
            {
                a[m]=st[i];
                m++;
            }
        }
        char x[]=new char[m];
        char X[]=new char[M];
        for(int i=0;i<m;i++)
        {
            x[i]=a[i];
        }
        for(int i=0;i<M;i++)
        {
            X[i]=A[i];
        }
        Arrays.sort(X);
        Arrays.sort(x);
        int c=0,v=0;
        for(int i=0;i<n;i++)
        {
            if(st[i]>64 && st[i]<91)
            {  
                a[i]=X[c];
                c++;
            }
            else 
            {
                if(st[i]>96 && st[i]<123)
                {
                    a[i]=x[v];
                    v++;
                }
            }
        }
        String s=  new String(a);
        return s;
    }
}

