
/*

Given a matrix of size n x m, 
where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

Example 1:

Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.
Example 2:

Input:
n = 1, m = 6, x = 55
matrix[][] = {{18, 21, 27, 38, 55, 67}}
Output: 1
Explanation: 55 is present in the matrix


TimeComplexity: O(N+M)
SpaceComplexity: O(1)

*/


import java.util.*;
class Main {
	public static void main(String args[]) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=30;
        int col=matrix[0].length-1;
        int row=0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target) System.out.println(true);
            else if(matrix[row][col]>target) col--;
            else if(matrix[row][col]<target) row++;
        }
        System.out.println(false);
        
	}
    
    
}

