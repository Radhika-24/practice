package wordbreak;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
<br>
Consider the following dictionary<br>
{ i, like, sam, sung, samsung, mobile, ice,<br>
  cream, icecream, man, go, mango}<br>

Input:  ilike<br>
Output: Yes<br>
The string can be segmented as "i like".<br>

Input:  ilikesamsung<br>
Output: Yes<br>
The string can be segmented as "i like samsung" or "i like sam sung".
 * @author abc
 */
public class WordBreak {

    /**
     * <b>Solution</b><br>
     * 1.Input Dictionary.<br>
     * 2.Split Dictionary on Space.<br>
     * 3.Input String.<br>
     * 4.Starting from 1st letter:<br>
     * {<br>
     * Split string and check if it exists in dictionary.<br>
     * if yes: start=current letter+1.<br>
     * }<br>
     * 5.Output.
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
            String dict[]=d.split("\\s+");
            
            
            String str=sc.nextLine();
            Arrays.sort(dict);
            int k=0;
            for(int i=0;i<=str.length();i++)
            {
                String aa=str.substring(k,i); 
                if(Arrays.binarySearch(dict, aa)>=0)
                {
                    k=i;
                }
                
            }
            if(k==str.length())
                System.out.println("1");
            else
                System.out.println("0");
            
        }
    }
    
}
