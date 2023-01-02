//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j]  =Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            obj.shortest_distance(matrix);
            for(int i = 0; i < n; i++){
                for(int j  = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function template for JAVA

class Solution
{
    public void shortest_distance(int[][] matrix)
    {
       //Flody Warshall
       int n = matrix.length;
       
       for( int i=0;i<n;i++){
           for( int j=0;j<n;j++){
               if(matrix[i][j]==-1){
                   matrix[i][j]=(int)(1e9);
               }
               if(i==j) matrix[i][j]=0;
           }  
       }
       
       for( int var =0;var<n;var++){
           for( int i=0;i<n;i++){
               for( int j=0;j<n;j++){
                   matrix[i][j]=Math.min(matrix[i][j], matrix[i][var]+matrix[var][j]);
               }
           }
       }
        for( int i=0;i<n;i++){
           for( int j=0;j<n;j++){
               if(matrix[i][j]==(int)1e9){
                   matrix[i][j]=-1;
               }
           }
       }
    }
}