
/*

Given two sorted arrays array1 and array2 of size m and n respectively. 
Find the median of the two sorted arrays.

Example 1:

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5
Example 2:

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5

Expected Time Complexity: O(min(log n, log m)).
Expected Auxiliary Space: O((n+m)/2).

Approach: HashMap 
*/


import java.util.*;
class Main {
    public static double medianOfArrays(int n, int m, int a[], int b[]) {
        int ans[]=new int[((n+m)/2)+1];
        int i=0; 
        int j=0;
        int exit=0;
        while(exit<=(n+m)/2 && i<n && j<m){
            if(a[i] < b[j]){
                ans[exit]=a[i];
                i++;
            }else if(a[i]>=b[j]){
                ans[exit]=b[j];
                j++;
            }
            exit++;
        }
        
        if(i<n){
            while(exit<=(n+m)/2 && i<n){
                ans[exit]=a[i];
                i++;
                exit++;
            }
        }
        if(j<m){
            while(exit<=(n+m)/2 && j<m){
                ans[exit]=b[j];
                j++;
                exit++;
            }
        }
        
        if((n+m)%2==0){
            int num=ans[ans.length-1];
            int num1=ans[ans.length-2];
            return ((num+num1)/2.00);
        }
        return ans[ans.length-1];
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N; i++){
            nums[i]=sc.nextInt();
        
        }
        int M=sc.nextInt();
        int nums2[]=new int[M];
        for(int i=0; i<M; i++){
            nums2[i]=sc.nextInt();
        }
        
        // int ele=sc.nextInt();
        int a=sc.nextInt();
        // int b=sc.nextInt();
		System.out.println(medianOfArrays( N, M, nums[],nums2[]));
        
      
      
    
       
      
	}
    
    
}
