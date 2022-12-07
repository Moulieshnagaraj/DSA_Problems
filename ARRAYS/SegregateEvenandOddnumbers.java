
/*

Input  = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3}
In the output, the order of numbers can be changed, i.e., 
in the above example, 34 can come before 12 and 3 can come before 9.

Time: O(N)
Space: O(1)
Algorithm used: Lomuto’s Partition Scheme

if element is even, just swap with odd.

*/


import java.util.*;
class Main {
    public static void SegregateEvenandOddnumbers(int[] arr){
		int i=-1;
		int j=0;
		while(j<arr.length){
			if(arr[j]%2 == 0){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
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
        // int k=sc.nextInt();
    
		SegregateEvenandOddnumbers( nums);
	}
    
    
}