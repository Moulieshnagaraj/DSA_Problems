
/*

Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

Time: O(N)
Space: O(1)
*/


import java.util.*;
class Main {
    public static int isPalindrome(String s)  {
       
       
       int len=S.length();
        for(int i=0; i<len/2; i++){
            if(S.charAt(i) != S.charAt(len-i-1)){
                return 0;
            }
        }
        return 1;
    
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		String s=sc.next();
        // char c[]=new char[n];
        // for(int i=0;i<n; i++){
        //     c[i]=sc.next();
        // }
        // int k=sc.nextInt();
		System.out.println(isPalindrome(s));
      
	}
    
    
}
