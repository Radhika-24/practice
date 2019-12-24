/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adjacentdupp;

import java.util.Scanner;

/**
 *Given a string s, recursively remove adjacent duplicate characters from the string s. The output string should not have any adjacent duplicates.
 * @author abc
 */
public class AdjacentDupp {

    /**
     * <b>Solution:</b><br>
     * 1. Take Input.<br>
     * 2. Scan whole string <br>
     * 3. if(next letter is same is current) --forward till letters repeat.)<br>
     *     else(add letter to result.
     * 4.If string different from result:<br>
     * <b>goto 2</b><br>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test>0)
        {
            test--;
            String str=sc.nextLine();
            String res="";
            int flag=1;
            while(flag!=0)
            {
                flag=0;
                for(int i=0; i<str.length();i++)
                {
                    if(i+1<str.length() && str.charAt(i+1)==str.charAt(i))
                    {
                        flag=1;
                        while(i+1<str.length() && str.charAt(i+1)==str.charAt(i))
                        i++;
                    }
                    else{
                        res+=str.charAt(i);//System.out.println("dss"+i);
                    }
                }
                if(flag==1)
                {
                    str=res;
                    res="";
                }
            }
            System.out.println(res);
        }
    }

}
