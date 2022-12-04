
/*

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

TC: O(N)
SC: O(N)

TECHNIQUE: PREFIX SUM

*/


import java.util.*;
class Main {
    public static int[]  productOfArray(int[] A)  {
        int N=A.length;
        int prefixMul[]=new int[N];
        int suffixMul[]=new int[N];
        
        

        // This loop stores all the prefixmultiplication of all element
        // CUMMULATIVE MULTIPLICATION
        prefixMul[0]=(int)A[0];
        for(int i=1; i<N; i++){
            prefixMul[i]=prefixMul[i-1]*(int)A[i];
        }

        // This loop stores all the suffix multiplication of all the elements
        suffixMul[N-1]=(int)A[N-1];
        for(int i=N-2; i>=0; i--){
            suffixMul[i]=suffixMul[i+1]*(int)A[i];
        }

        int ans[]=new int[N];
        
        if(N==1){
            ans[0]=1;
            return ans;
        }
        
        for(int i=0; i<N; i++){
            if(i==0){
                ans[i]=suffixMul[i+1];
            }else if(i==N-1){
                ans[i]=prefixMul[i-1];
            }
            else{
                ans[i]=prefixMul[i-1]*suffixMul[i+1];
            }
        }
        return ans;
    }
    
    
    
    
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
        int c[]=new int[s];
        for(int i=0;i<s; i++){
            c[i]=sc.nextInt();
        }
        // int k=sc.nextInt();
		int[] ans=productOfArray(c);
        
        
        for(int i=0; i<s; i++){
            System.out.print(ans[i]+" ");
        }
      
	}
    
    
}
