
/*

Input : a[] = {1, 0, 0, 1, 1, 0, 1}, 
          k = 1.
Output : 4

Explanation : Here, we should only change 1
zero(0). Maximum possible length we can get
is by changing the 3rd zero in the array, 
we get a[] = {1, 0, 0, 1, 1, 1, 1}

Input : a[] = {1, 0, 0, 1, 0, 1, 0, 1, 0, 1}, 
         k = 2.
Output : 5

Output: Here, we can change only 2 zeros. 
Maximum possible length we can get is by 
changing the 3rd and 4th (or) 4th and 5th 
zeros.


Efficient Approach: SLIDING WINDOW
Time Complexity: O(N)
Space:   O(1)


HINT: MAXIMUM NUM--> (j-i)+1
*/


import java.util.*;
class Main {
    public static int LongestSubsegmentof1s(int[] nums,int k){
        int i=0;
		int j=0;
		int ZeroCount=0;
		int maxi=Integer.MIN_VALUE; 
		while(j<nums.length){
			if(nums[j]==0){
				ZeroCount++;
			}
			
			while(ZeroCount>k){
				if(nums[i]==0){
					ZeroCount--;
				}
				i++;
			}
			
			maxi=Math.max(maxi,(j-i)+1);
			j++;
		}
		return maxi;
       
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
		System.out.println(LongestSubsegmentof1s( nums, k));
        
      
      
    
       
      
	}
    
    
}
