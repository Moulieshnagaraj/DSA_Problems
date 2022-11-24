
/*

Given a string S, 
find length of the longest substring with all distinct characters. 

Example 1:

Input:
S = "geeksforgeeks"
Output: 7
Explanation: "eksforg" is the longest 
substring with all distinct characters.


‹Example 2:

Input: 
S = "aaa"
Output: 1
Explanation: "a" is the longest substring 
with all distinct characters.
the majority element.

Expected Time Complexity: O(n) (very effective)
Expected Auxiliary Space: O(n)

#################################################################################################################
Technique: SLIDING WINDOW, HASHMAP
l=0,r=0
max=0;

hashmap
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      | 
--------

step 1:

l
!
a b c a a b c d b a
i
r

-> check a in map | not present 
   so, we put a with its index
   map.put(a, r); r->index
   
   and r is incremented.
   
   max=max(max, l-r+1); // 0
   
hashmap
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
| a:0  | 
--------

********************
step 2:

l
!
a b c a a b c d b a
  i
  r

-> check b in map | not present 
   so, we put b with its index
   map.put(b, r); r->index
   
   max=max(max, l-r+1); // (0, 1-0+1) // 2
   
   and r is incremented.
   
hashmap
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
| b:1  |
| a:0  | 
--------

********************
step 3:

l
!
a b c a a b c d b a
    i
    r

-> check 'c' in map | not present 
   so, we put 'c' with its index
   map.put(c, r); r->index
   
   max=max(max, l-r+1); // (2, 2-0+1) // 3
   
   and r is incremented.
   
hashmap
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
| c:2  |
| b:1  |
| a:0  | 
--------

********************
step 4:

l
!
a b c a a b c d b a
      i
      r

-> check 'a' in map | present (important)
   it means there is a duplicate in range of 0->3
   l is update with max(duplicate value of 'a' index+1,l);
   
   l=max(0+1, 0) // 1
   
   so l is jumped to
      l
      !
    a b c a a b c d b a
          ^
          r 
   
   
   now  put 'a' with r index,
   
   max=max(max, l-r+1); // (3, 3-1+1) // 3
   
   and r is incremented.
   
hashmap
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
| c:2  |
| b:1  |
| a:3  | 
--------
********************
step 5:

  l
  !
a b c a a b c d b a
        i
        r

-> check 'a' in map | present (important)
   it means there is a duplicate in range of 1->4
   l is update with max(duplicate value of 'a' index+1,l);
   
   a value in map is 3,
   
   l=max(3+1, 1) // 4
   
   so l is jumped to
            l
            !
    a b c a a b c d b a
            ^
            r 
   
   
   now  put 'a' with r index,
   
   max=max(max, l-r+1); // (3, 4-4+1) // 3
   
   and r is incremented.

hashmap
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
| c:2  |
| b:1  |
| a:4  | 
--------
********************
step 6:

        l
        !
a b c a a b c d b a
          i
          r

-> check 'b' in map | present (important)
   
   l is update with max(duplicate value of 'b' index+1,l);
   
   b value in map is 1,
   
   l=max(1+1, 4) // 4 here, it is clear why we are taking maximum..
                    However, we found duplicate at index 1, it's not necessary
                    to go back, 
                    as of now our current window holds " a b "
   
  
            l
            !
    a b c a a b c d b a
              ^
              r 
   
   
   now  put 'b' with r index,
   
   max=max(max, l-r+1); // (3, 5-4+1) // 3
   
   and r is incremented.

hashmap
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
|      |
| c:2  |
| b:5  |
| a:4  | 
--------
...
...
.......
........
............

At last max value will be 4 " b c d b a "
*/


import java.util.*;
class Main {
    public static int longestSubstrDistinctChars(String S) {
       
       
       HashMap<Character, Integer> map=new HashMap<>();
        
        int left=0;
        int right=0;
        int maxLen=0;
        
        while(right<S.length()){
            if(map.containsKey(S.charAt(right))){
                left=Math.max(map.get(S.charAt(right))+1, left);
            }
            
            map.put(S.charAt(right), right);
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        
        return maxLen;
       
    
       
       
       
       /*
        // This solution runs with O(2N) time complexity.
        
        
        
        HashSet<Character> chars=new HashSet<Character>();
        int i=0; 
        int j=0;
        int maxLen=Integer.MIN_VALUE;
        while(j<S.length()){
            
            // Checks whether char is exist in set, if yes
            // remove the ith character,increse i.
            while(chars.contains(S.charAt(j))){
                chars.remove(S.charAt(i));
                i++;
            }
            
            // if doesn't exist add it to set
            chars.add(S.charAt(j));
            
            // Calculate the length.
            maxLen=Math.max(maxLen, (j-i)+1);
            j++;
            
        }
        return maxLen;
        
        */
       
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
		System.out.println(longestSubstrDistinctChars(String s));
      
	}
    
    
}
