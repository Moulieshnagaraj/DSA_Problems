
/*

Given a string you need to print the size of the longest possible substring that has exactly K unique characters. 
If there is no possible substring then print -1.


Example 1:

Input:
S = "aabacbebebe", K = 3
Output: 7
Explanation: "cbebebe" is the longest 
substring with K distinct characters.
Example 2:

Input: 
S = "aaaa", K = 2
Output: -1
Explanation: There's no substring with K
distinct characters.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

#################################################################################################################

TECHNIQUE: SLIDING WINDOW AND HASHMAP


*/


import java.util.*;
class Main {
    public static int longestkSubstr(String s, int k) {
       
        int start=0;
        int end=0;
        int maxLength=0;
       
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
       
       
        while(end<s.length()){
            char cur_char=s.charAt(end);
            map.put(cur_char, map.getOrDefault(cur_char, 0)+1);
           
            while(map.size()>k){
               char charFromStart=s.charAt(start);
               
               map.put(charFromStart, map.get(charFromStart)-1);
               
               if(map.get(charFromStart)==0){
                   map.remove(charFromStart);
               }
               start++;
            }
            if(map.size()==k){
                maxLength=Math.max((end-start)+1, maxLength);
            }
           
           end++;
       }
       
        if(maxLength==0){
           return -1;
        }
        return maxLength;
       
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		String s=sc.next();
        // int num[]=new int[n];
        // for(int i=0;i<n; i++){
        //     num[i]=sc.nextInt();
        // }
        int k=sc.nextInt();
		System.out.println(longestkSubstr(String s, int k));
      
	}
    
    
}
