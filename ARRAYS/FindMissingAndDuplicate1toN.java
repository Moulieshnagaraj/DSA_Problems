/*

Arr={5, 4, 2,1,1}
o/p: Missing: 3
     Duplicate: 1

Aprroach: Cyclic Sort (Applicable only for 1 to N)

Time : O(N)
Space: O(1)

*/

import java.util.*;
class Main {
    public static void FindMissingAndDuplicate1toN(int[] nums){
        int i=0;
		while(i<nums.length){
			int otherIndex=nums[i]-1;
			if(nums[i] <= nums.length && nums[i] != nums[otherIndex]){
				int temp=nums[i];
				nums[i]=nums[otherIndex];
				nums[otherIndex]=temp;
				
			}
			else{
				i++;
			}
		}
		
		for(i=0; i<nums.length; i++){
			if(nums[i]!=i+1){
				System.out.println("Missing: "+(i+1)+" Duplicate: "+nums[i]);
				break;
			}
		}
       
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
        // int k=sc.nextInt();
        FindMissingAndDuplicate1toN( nums);
      
      
    
       
      
	}
    
    
}
