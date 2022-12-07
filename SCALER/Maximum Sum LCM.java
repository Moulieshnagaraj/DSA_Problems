
/*

Given a positive number n. 
You need to write a program to find the maximum sum of distinct numbers 
such that the LCM of all these numbers is equal to n.

Example 1:

Input: n = 2
Output: 3 
Explanation: The distinct numbers you can have are 
just 1 and 2 and their sum is equal to 3.
Example 2:

Input: n = 5
Output: 6
Explanation: The distinct numbers you can have 
are just 1 and 5 and their sum is equal to 6

Expected Time Complexity: O(sqrt(n))
Expected Auxiliary Space: O(1)

*/


import java.util.*;
class Main {
    public static long maxSumLCM(int n) {
        // if n=8 LCM--> 1,2,4,8
        // if n=4 LCM--> 1,2,4
        /*
        
        Exception:
        for n=4,sqrt(4)--> 2
        if i=1;
        sum=sum+(n/i)+i ==> 0+(4/1)+i ==> 0+4+1 ==> 5
        if i=2
        sum=5+(4/2)+2 ==> 5+2+2 ==> 9 (wrong output), 
        
        So--> whenever (n/i)==i, (4/2) == 2, we need to sum only the i,
        for i=2,
        sum=sum+i --> 5+2 --> 7(correct output)
        
        */
        long sum=0;
        int num=(int)Math.sqrt(n);//math.sqrt(8) --> 2 // math.sqrt(4) --> 2
        for(int i=1; i<=num; i++){ // 1 --> 2(including)
            if(n%i==0){
                if(n/i == i){ 
                    sum=sum+(long)i;
                }else{
                    /*
                    i=1, 0+8+1 -->sum=9
                    i=2, 9+4+2 --> sum=15
                    With just two iteration
                    */
                    sum=sum+(long)(n/i)+(long)i; 
                }
            }
        }

        return sum;
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        // String S=sc.next();
		System.out.println(maxSumLCM(n));
        
      
      
    
       
      
	}
    
    
}
