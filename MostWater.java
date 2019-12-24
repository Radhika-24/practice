/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostwater;

import java.util.Scanner;

/**
 *Given N non-negative integers a_1, a_2, ..., a_n  where each represents a point at coordinate  (i, a_i) . N vertical lines are drawn such that the two endpoints of line i is at  (i, a_i)  and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * @author abc
 */
public class MostWater {

    /**
     * <b> Solution</b> <br>
     * 1. Take input.<br>
     * 2. For every point, i <br>
     * {<br>
     * Calculate area for all successive points.<br>
     * update max area<br>
     * }<br>
     * 3. output<br>
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0){
            test--;
            int num=sc.nextInt();
            int arr[]=new int[num];  //Array of points
            for(int i=0;i<num;i++)
            {
                arr[i]=sc.nextInt();
            }
            int water=0; //max water
            for(int i=0;i<num;i++)
            {
                int wat=0; //current water
                for(int j=i+1;j<num;j++)
                {
                    int m=Integer.min(arr[i], arr[j]);
                    wat= (j-i)*m;
                    if(wat>water)
                    {
                        water=wat;
                    }
                }
            }
            System.out.println(water);
        }
    }
    
}
