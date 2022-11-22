
/*

Given a String S, reverse the string without reversing its individual words.
Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i





*/


import java.util.*;
class Main {
    public static String reverseWords(String S) {
        String ans="";
        String str="";
        for(int i=0; i<S.length(); i++){
           if(S.charAt(i)!='.'){
               str=str+S.charAt(i);
           }else{
                ans="."+str+ans;
                str="";
           }
           
        }
       
        ans=str+ans;
        return ans;
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		// int N=sc.nextInt();
        // int nums[]=new int[N];
        // for(int i=0; i<N; i++){
        //     nums[i]=sc.nextInt();
        
        // }
        // int M=sc.nextInt();
        // int nums2[]=new int[M];
        // for(int i=0; i<M; i++){
        //     nums2[i]=sc.nextInt();
        // }
        
        // int ele=sc.nextInt();
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        String S=sc.next();
		System.out.println(reverseWords(S));
        
      
      
    
       
      
	}
    
    
}
