//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        int index=n-1;
        int[] dp=  new int[n+1];
        Arrays.fill(dp,-1);
        return find(arr,index,dp);
       
    }
    public int find(int[] nums,int index,int[] dp){
        if(index==0) return nums[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int process=nums[index]+find(nums,index-2,dp);
        int unProcess=0+find(nums,index-1,dp);
         return  dp[index]=Math.max(process,unProcess);
    }
   
}