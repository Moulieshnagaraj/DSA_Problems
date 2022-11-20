
/*

Given an unsorted array arr[] with both positive and negative elements, 
the task is to find the smallest positive number missing from the array.

Input:  arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1

Input:  arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4

Input: arr[] = {1, 1, 0, -1, -2}
Output: 2

Time: O(N)
Space: O(1)

Approach:Cyclic sort and compare with the index.

*/


import java.util.*;
class Main {
    public static int FindFirstMissingPositiveNumber(int[] nums){
		int ptr=0;
		// Checks does the given array contains 1
        for(int i=0; i<nums.length; i++){
			if(nums[i]==1){
				ptr=1;
				break;
			}
		}
		
		if(ptr==0){
			return 1;
		}
		
		//Change all the negative values and the values greater than N --> to 1
		for(int i=0; i<nums.length; i++){
			if(nums[i]<=0 || nums[i]>nums.length){
				nums[i]=1;
			}
		}
		
		// Here sorting the array using cyclic sort
		for(int i=0; i<nums.length; i++){
			int otherIndex=nums[i]-1;
			if(nums[i] != nums[otherIndex]){
				int temp=nums[i];
				nums[i]=nums[otherIndex];
				nums[otherIndex]=temp;
			}
		}
		
        // Find the missing element by comparing value with its index.
		for(int i=0; i<nums.length; i++){
			if(nums[i] != i+1){
				return i+1;
			}
		}
		
		// If no positive missing element found, return N+1
		return nums.length+1;
		
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N; i++){
            nums[i]=sc.nextInt();
        
        }
        
    
		System.out.println(FindFirstMissingPositiveNumber( nums));
        
      
      
    
       
      
	}
    
    
}
