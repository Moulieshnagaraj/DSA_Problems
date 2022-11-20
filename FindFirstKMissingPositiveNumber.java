
/*

Input : [2 3 4] 
         k = 3
Output : [1 5 6]

Input  : [-2 -3 4] 
          k = 2
Output : [1 2]

Time: O(N+K)
Space: O(N)

Aprroach:Using hashset

*/


import java.util.*;
class Main {
    public static void FindFirstKMissingPositiveNumber(int[] nums, int k){
		HashSet<Integer> set=new HashSet<>();
		int n=nums.length;
		for(int i=0; i<n; i++){
			if(!set.contains(nums[i])){
				set.add(nums[i]);
			}
		}
		int count=0;
		for(int i=1; i<=(n+k);i++){
			if(!set.contains(i) && count<k){
				System.out.print(i+" ");
				count++;
			}
		}
		
    }
    
    public static void main(String args[])
	{
        Sncanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N; i++){
            nums[i]=sc.nextInt();
        
        }
        int k=sc.nextInt();
    
		FindFirstKMissingPositiveNumber( nums, k);
        
      
      
    
       
      
	}
    
    
}
K-