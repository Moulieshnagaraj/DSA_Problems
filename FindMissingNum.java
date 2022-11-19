/*

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Time: O(N)
space: O(1)

formula: n(n+1)/2
*/

import java.util.*;
class Main {
    public static void FindMissingNum(int[] arr,int n){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        
        int total=(n*(n+1)/2);
        System.out.println(total-sum);
        
        
    }
	public static void main(String args[]) {
		
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N;i++){
            nums[i]=sc.nextInt();
        }
        
        int n=sc.nextInt();

        System.out.print(FindMissingNum(nums,n));
		
	}
    
    
}