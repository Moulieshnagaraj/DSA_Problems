
/*
Given an array A, 
find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.

Example Input
Input 1:
A = [1, 3]

Input 2:
A = [2]


Example Output
Output 1:
 2
 
Output 2:
 1

Example Explanation

Explanation 1:
 Only choice is to take both elements.
 
Explanation 2:
 Take the whole array.
 
 TECHNIQUE: CARRY FORWARD the min and max FROM 0 TO i
 
 TC: O(N)
 SC: O(1)

*/


import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        
        // Getting input from User
        int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0; i<N; i++) A[i]=sc.nextInt();
		
		// Finding out the max and min of the array.
		int minEle=A[0];
        int maxEle=A[0];
        for(int i=0; i<A.length; i++){
            minEle=Math.min(minEle,A[i]);
            maxEle=Math.max(maxEle, A[i]);
        }
        
        // Finding out the smallest subarray.
        int ans=A.length;
        int latest_min=-1; // (INDEX) // Initializing with -1, as we don't the latest max and min element index.
        int latest_max=-1;
        for(int i=0; i<A.length; i++){
            if(A[i]==maxEle){
                latest_max=i;
                if(latest_min!=-1){
                    ans=Math.min(ans, i-latest_min+1);
                }
            }

            if(A[i]==minEle){
                latest_min=i;
                if(latest_max!=-1){
                    ans=Math.min(ans, i-latest_max+1);
                }
            }
        }
        return ans;
	}
}