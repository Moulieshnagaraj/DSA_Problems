
/*

Given an integer array A of size N and an integer B, 
you have to return the same array after 
rotating it B times towards the right.

Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2

Input 2:

A = [2, 5, 6]
B = 1


Example Output
Output 1:

[3, 4, 1, 2]

Output 2:

[6, 2, 5]

Time: O(N)
Space: O(1)


Step1: Reverse entire array
Step2: Again reverse the array from 0 - k-1
Step3: Again reverse the array from k - n-1

*/


import java.util.*;
class Main {
    public static int[]  ArrayRotation(int[] A, int B)  {
        int n = A.length;
        B = B % n;
        reverse(A, 0, n - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, n - 1);
        return A;
    }
    
    public static void reverse(int[] A, int start, int end){
        int i, j;
        for (i = start, j = end; i < j; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
    
    
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
        int c[]=new int[s];
        for(int i=0;i<s; i++){
            c[i]=sc.nextInt();
        }
        int k=sc.nextInt();
		int[] ans=ArrayRotation(c, k);
        
        
        for(int i=0; i<s; i++){
            System.out.print(ans[i]+" ");
        }
      
	}
    
    
}
