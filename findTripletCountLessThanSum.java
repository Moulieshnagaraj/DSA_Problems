/*

Input : arr[] = {-2, 0, 1, 3}
        sum = 2.
Output : 2 // Count of triplets 
Explanation :  Below are triplets with sum less than 2
               (-2, 0, 1) and (-2, 0, 3) 

Input : arr[] = {5, 1, 3, 4, 7}
        sum = 12.
Output : 4
Explanation :  Below are triplets with sum less than 12
               (1, 3, 4), (1, 3, 5), (1, 3, 7) and 
               (1, 4, 5)

Naive approach: O(N^3)

Efficient approach: O(N^2)
Space: O(1)

* Sort the array
* fix the ith element and use two pointer start and end
* Start should be at ith+1 and end should be at N-1
* Check if arr[i]+arr[start]+arr[end] < K
  if yes all the arr[end-1..] + arr[i]+ arr[start] is less than k, to find that
  (end-start)--> gives triplets less than K for ith fixed;
   start++;

*/


import java.util.*;
class Main {
    public static int findTripletCountLessThanSum(int[] arr, int k){
        
        int count=0;
        Arrays.sort(arr);
       
        for(int i=0; i<arr.length-2; i++){
   
            int start=i+1;
            int end=arr.length-1;
            while(start < end){
                if(arr[i]+arr[start]+arr[end] >= k){
                    end--;
                }
                else{
                    count=count+(end-start);
                    start++;
                }
                
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

        System.out.print(findTripletCountLessThanSum(nums, k));
		
	}
    
    
}