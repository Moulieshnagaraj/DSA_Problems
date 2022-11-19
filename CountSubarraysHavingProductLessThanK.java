
/*
Input : 
n = 4, k = 10
a[] = {1, 2, 3, 4}
Output : 
7
Explanation:
The contiguous subarrays are {1}, {2}, {3}, {4} 
{1, 2}, {1, 2, 3} and {2, 3} whose count is 7


Input:
n = 7 , k = 100
a[] = {1, 9, 2, 8, 6, 4, 3}
Output:
16


Efficient Approach: Sliding window, Start and end pointer
Time: O(N)
Space: O(1)

To find count: (HINT)
len=(end-start)+1;
count=count+len

*/

import java.util.*;
class Main {
    public static int CountSubarraysHavingProductLessThanK(int[] arr,int k){
        int count=0;
        long product=1;
        int start=0;
        for(int i=0;i<n;i++){
            product=product*arr[i];
            while(start<i && product>=k){
                product=product/arr[start];
                start++;
            }
            if(product < k){
                int len=(i-start)+1;
                count=count+len;
            }
        }
        return count;
        
        
    }
	public static void main(String args[]) {
		
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N;i++){
            nums[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();

        System.out.print(CountSubarraysHavingProductLessThanK(nums,k));
		
	}
    
    
}