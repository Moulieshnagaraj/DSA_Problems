/*

Arr={1 2 3 4 -5}
k=10

O/P: 9
Sums of triplets:
1 + 2 + 3 = 6
2 + 3 + 4 = 9
1 + 3 + 4 = 7
...
...
9 is closest to 10.

Naive approach: O(N^3)

Efficient approach: 
Time complexity:  O(N^2)
Space complexity: O(1)


Approach: Start and End pointer. 
*/


import java.util.*;
class Main {
    public static int FindTripletSumClosestToGivenSum(int[] arr, int k){
        
        int minClose=Integer.MIN_VALUE;
        int maxClose=Integer.MAX_VALUE;

        Arrays.sort(arr);
       
        for(int i=0; i<arr.length-2; i++){
   
            int start=i+1;
            int end=arr.length-1;
            while(start < end){
                int sum=arr[i]+arr[start]+arr[end];
                if(sum<k){
                    minClose=Math.max(minClose, sum);
                    start++;
                }else if(sum >= k){
                    maxClose=Math.min(maxClose, sum); 
                    end--;
                }
                
            }
            
        }
       
        if(Math.abs(k-minClose) < Math.abs(k-maxClose)){
            return minClose;
        }
        return maxClose;
        
        
    }
	public static void main(String args[]) {
		
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N;i++){
            nums[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();

        System.out.print(FindTripletSumClosestToGivenSum(nums, k));
		
	}
    
    
}