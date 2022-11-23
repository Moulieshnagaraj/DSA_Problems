
/*

Given an array A of N elements. 
Find the majority element in the array. 
A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1

Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.


Example 2:
Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3

Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

#################################################################################################################

Algorithm: Boyer moore voting Algorithm

Explanation:
1. Begin by initializing two variables, num and a counter count, both of which are set to 0.
2. Now we’ll begin iterating over the number and for each element x.
3. We first check to see if the count is 0, and then we assign num to x.
4. Then we check to see if the current num is equal to x, if not, we decrease the count by one, else we increment it by one.
5. Reset the counter to zero.
6. Find the frequency of the num variable by looping through the nums array.
7. Now, if the count is larger than N/2, we return num; otherwise we return -1.

LLUSTRATION:
Input: { 1,7,2,7,8,7,7}

Index 0: num = 1, count =1
Index 1: num = 1, count =0 ( 7 not equal to 1)
Index 2: num = 2 (as the count is 0 we initalise num to current), count =1
Index 3: num = 2, count =0 ( 7 not equal to 2)
Index 4: num = 8 (as the count is 0 we initalise num to current), count =1
Index 5: num = 8, count =0 ( 7 not equal to 8)
Index 6: num = 7 (as the count is 0 we initalise num to current), count =1

Now we can check for the frequency of 7, i.e, 4 which is > 7/2.



#####################################################################################################################

Intention: This Algorithm returns majority candidate in the given array, only when given arrays contains majority element.

In this problem, given array either contains majority elements or distinct element.
Whatever the case is, at end of this algorithm, we have an element as a candidate. 
Traverse the array to check the the count of candidate is greater than n/2. -->yes return candidate else return -1;

#####################################################################################################################

*/


import java.util.*;
class Main {
    public static int majorityElement(int a[]) {
       
        int candidate=0;
        int count=0;
        for(int num: a){
            if(count==0) candidate=num;
            
            if(num==candidate) count++;
            else count--;
        }
        
        //Checking the count of candidate is greater than n/2.
        int candCount=0;
        for(int num: a){
            if(num==candidate) candCount++; 
        }
        
        if(candCount > (size/2)){
            return candidate;
        }else{
            return -1;
        }
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n; i++){
            num[i]=sc.nextInt();
        }
		System.out.println(majorityElement(num));
      
	}
    
    
}
