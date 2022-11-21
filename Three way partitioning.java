
/*

Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.


Example 1:

Input: 
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 1
Explanation: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid
arrangement, output will be 1

Effective Approach: DUTCH NATIONAL FLAG ALGO

Time: O(N)
Space: O(1)


*/


import java.util.*;
class Main {
    public static void threeWayPartition(int[] arr,int a, int b){
        int low=0;
        int high=array.length-1;
        int mid=0;
        while(mid<=high){
            if(array[mid]<a){
                int temp=array[low];
                array[low]=array[mid];
                array[mid]=temp;
                low++;
                mid++;
            }
            else if(array[mid]>b){
                int temp=array[high];
                array[high]=array[mid];
                array[mid]=temp;
                high--;
            }
            else {
                mid++;
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
        int a=sc.nextInt();
        int b=sc.nextInt();
		threeWayPartition( nums, a,b);
        
      
      
    
       
      
	}
    
    
}
