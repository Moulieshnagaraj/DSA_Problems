
/*

Given an expression string x. 
Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}

Output: 
true

Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.


Example 2:

Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.


Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.

Time: O(N)
Space: O(N)

Technique: HashMap

*/


import java.util.*;
class Main {
    public static boolean validParanthesis(String x)  {
        ArrayList<Character> chars=new ArrayList<Character>();
        HashMap<Character, Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        
        for(int i=0; i<x.length(); i++){
            if(map.containsKey(x.charAt(i))){
            
                if(chars.size()>0 && map.get(x.charAt(i)) == chars.get(chars.size()-1)){
                    chars.remove(chars.size()-1);
                }else{
                    return false;
                }
            }else{
                chars.add(x.charAt(i));
            }
            
        }
        if(chars.size()!=0){
            return false;
        }
        return true;
    
       
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
		System.out.println(validParanthesis(s));
      
	}
    
    
}
