
/*

Problem Description
Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, 
find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value.
 
Example Input

Example 1:

Input: 
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.
 
Input: 
n = 5
arr[] = {1, 45, 47, 50, 5}
Output: 50
Explanation: Maximum element is 50.


PATTERN: BINARY SEARCH
 
 TC: O(log n)
 SC: O(1)

*/


import java.util.*;
class Main {
	public static void main(String args[]) {
        int A[] = {1,15,25,45,42,21,17,12,11};
        int start=0;
        int end=n-1;
        int ans=arr[(start+end)/2];
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])){
                ans=arr[mid];
                break;
            }
            else if (arr[mid]<=arr[mid+1]){
                start=mid+1;
            }else if(arr[mid-1]>=arr[mid]){
                end=mid-1;
            }
        }
        System.out.println(ans);
        
        
	}
    
    
}