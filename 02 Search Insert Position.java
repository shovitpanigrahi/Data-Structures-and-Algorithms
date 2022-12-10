//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.searchInsertK(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        int left=0;
        int right=N-1;
        
        //lower bound
        
        // if(k<Arr[left]){
        //     return 0;
        // }
        // //upperbound
        // if(k>Arr[right]){
        //     return N+1;
        // }
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(k==Arr[mid]){
                return mid;
            }
            if(k>Arr[mid]){
                left=mid+1;
            }
            else if(k<Arr[mid]){
                right=mid-1;
            }
        }
        return left;
    }
}