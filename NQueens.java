package nqueens;

import java.util.Scanner;

/**
 * NQueesn Problem by backtracking.
 * @author abc
 */
public class NQueens {

    /**
     * Checks if putting queen at (r,c) will attack other queen on board.<br> 
     * @param r row of board<br>
     * @param c column of board<br>
     * @return true if attack possible and false if not<br>
     * 
     */
    public static boolean attacks(int r, int c)
    {
        for(int i=0;i<n;i++)
        {
            if(b[r][i]==1)
            {
                return true;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(b[i][c]==1)
            {
                return true;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j)==(r+c) && b[i][j]==1 )
                {
                    return true;
                }
                if((i-j)==(r-c) && b[i][j]==1 )
                {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * recursively places queens on row p.
     * @param p row in which queen to be placed.
     * @return true if placement possible else false
     */
    public static boolean nqueen(int p)
    {   
        if(p>=n)
        {
            return true;
        }
        
            for(int j=0;j<n;j++)
            {
                if(attacks(p, j))
                {
                    continue;
                }
                b[p][j]=1;
                if(nqueen(p+1))
                    return true;
                b[p][j]=0;
            }
        
        return false;
    }
    /**
     * size of board
     */
    public static int n;
    /**
     * board
     */
    public static int b[][]=new int[10][10];
    /**
     * Main function.
     * Takes input and displays output
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        boolean a=nqueen(0);
        if(a)
        {
            System.out.println("Yes");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
            System.out.println("No");
    }
    
}
