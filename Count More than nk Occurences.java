
/*

Given an array arr[] of size N and an element k. 
The task is to find all elements in array that appear more than n/k times.

Example 1:

Input:
N = 8
arr[] = {3,1,2,2,1,2,3,3}
k = 4

Output: 2

Explanation: In the given array, 3 and
 2 are the only elements that appears 
more than n/k times.


Example 2:

Input:
N = 4
arr[] = {2,3,3,2}
k = 3

Output: 2

Explanation: In the given array, 3 and 2 
are the only elements that appears more 
than n/k times. So the count of elements 
are 2.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Approach: HashMap 
*/


import java.util.*;
class Main {
    public static void countOccurence(int[] arr,int a){
        HashMap<Integer,Integer> map=new HashMap<>();
       int count=0;
       int n=arr.length;
       int val=arr.length/a;
       for(int i=0; i<n; i++){
           if(map.containsKey(arr[i])){

              map.put(arr[i], map.get(arr[i])+1);
           }
           map.put(arr[i],1);
       }
       System.out.println(map);
       
       for(int num: arr){
           if(map.get(num)>val){
               count++;
           }
       }
       System.out.println(count);
       
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
        // int b=sc.nextInt();
		countOccurence( nums, a);
        
      
      
    
       
      
	}
    
    
}
