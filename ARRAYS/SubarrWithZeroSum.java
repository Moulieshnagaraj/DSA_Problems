/*

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.

Time: O(N)
Space: O(N)

Approach: Hashset to store prefix sum, if sum in hashset or sum==0 return true / add.

*/


import java.util.*;

class Main {
    public static boolean SubarrWithZeroSum(int[] arr){
        int sum=0;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(set.contains(sum) || sum==0){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    
    
    
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] num=new int[N];
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        // int k=sc.nextInt();
        System.out.println(SubarrWithZeroSum(num));
        
    }
}