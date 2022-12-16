
/*

Problem Description
Given an array of N integers Arr1, Arr2, ….ArrN, 
count number of subarrays of Arr which are strictly increasing. 
A subarray Arr[i, j] is the array where 1 <= i < j <= N is a sequence of integers of Arri, Arri+1, ….Arrj. 
A subarray Arr[i, j] is strictly increasing if Arri < Arri+1 < Arri+2 < ……. < Arrj.


SUBARRAY LENGTH > 1


Example 1:

Input: 
N = 6
Arr[] = {1, 3, 3, 2, 3, 5}
Output: 4
Explanation:
(1,3), (2, 3), (3, 5) and (2, 3, 5)
are the only increasing subarrays.

Example 2:
Input: 
N = 2
Arr[] = {1 5} 
Output: 1
Explanation:(1, 5) is the only increasing
subarray.


PATTERN: Two pointer approach (variable sliding window)
 
 TC: O(n)
 SC: O(1)

*/


import java.util.*;
class Main {
	public static void main(String args[]) {
        int A[] = {1, 3, 3, 2, 3, 5};
        int s=0;
        int e=1;
        int count=0;
        while(e<n){
            if(arr[e-1]<arr[e]){
                count+=(e-s);
                e++;
            }else{
                s=e;
                e++;
            }
        }
        
        System.out.println(count);
        
        
	}
    
    
}