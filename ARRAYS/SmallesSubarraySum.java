
/*

Given an array of integers (A[])  and a number x, 
find the smallest subarray with sum greater than the given value. 
If such a subarray do not exist return 0 in that case.

Note: The answer always exists. 
It is guaranteed that x doesn't exceed the summation of a[i] (from 1 to N).

Example 1:

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}

Effective Approach: SLIDING WINDOW

Time: O(N)
Space: O(1)


*/


import java.util.*;
class Main {
    public static int smallestSubWithSum(int[] arr,int x){
        int i=0,j=0,sum=0;
        int min=Integer.MAX_VALUE;
        while(j<n){
            sum=sum+arr[j];
            while(sum>x){
                sum=sum-arr[i];
                min=Math.min(min, ((j-i)+1));
                i++;
            }
            j++;
        }
        
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N; i++){
            nums[i]=sc.nextInt();
        
        }
        
        // int ele=sc.nextInt();
        int k=sc.nextInt();
		System.out.println(smallestSubWithSum( nums, k));
        
      
      
    
       
      
	}
    
    
}
