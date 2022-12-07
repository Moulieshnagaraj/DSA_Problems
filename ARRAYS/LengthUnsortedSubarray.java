
/*
Input:
N = 11
Arr[] ={10,12,20,30,25,40,32,31,35,50,60}

Output: 3 8

Explanation: Subarray starting from index
3 and ending at index 8 is required
subarray. 

Initial array: 10 12 20 30 25 40 32 31 35 50 60 
Final array:   10 12 20 25 30 31 32 35 40 50 60

********************************************

Input:
N = 9
Arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50}

Output: 2 5

Explanation: Subarray starting from index
2 and ending at index 5 is required
subarray.

Initial array: 0 1 15 25 6 7 30 40 50
Final array:   0 1 6 7 15 25 30 40 50

TimeComplexity: O(N)
SpaceComplexity: O(1)

*/

import java.util.*;
class Main {
    public static String LengthUnsortedSubarray(int[] arr){
        int start, high;
        for(start=0; start<arr.length-1;start++){
            if(arr[start]>arr[start+1]){
                break;
            }
        }
        
        if(start==arr.length-1){
            return "0 0";
        }
        
        for(high=arr.length-1; high>0; high--){
            if(arr[high]<arr[high-1]){
                break;
            }
        }
        int min=arr[start];
        int max=arr[start];
        for(int s=start+1; s<=high;s++){
            min=Math.min(min, arr[s]);
            max=Math.max(max, arr[s]);
        }
        
        for(int i=0; i<arr.length; i++){
            if(min<arr[i]){
                start=i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0;i--){
            if(max>arr[i]){
                high=i;
                break;
            }
        }
        
        return start+" "+high;
        
    }
	public static void main(String args[]) {
		
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N;i++){
            nums[i]=sc.nextInt();
        }
        
        // int k=sc.nextInt();

        System.out.print(LengthUnsortedSubarray(nums));
		
	}
    
    
}