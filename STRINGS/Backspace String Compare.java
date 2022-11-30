
/*

Given two strings s and t, 
return true if they are equal when both are typed into empty text editors. 
'#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".


Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

Time: O(N+M)
Space: O(1)

Technique: Two Pointer from back.
If we encounter any '#' we just need skip that much elements.

*/


import java.util.*;
class Main {
    public static boolean backspaceCompare(String x)  {
        int ind1=s.length()-1;
        int ind2=t.length()-1;

        while(ind1>=0 || ind2>=0){
           ind1=returnI(s, ind1);
           ind2=returnI(t, ind2);
           if(ind1>=0 && ind2>= 0 && s.charAt(ind1)!=t.charAt(ind2)){
               return false;
           }
           if(ind1>=0 != ind2>=0) return false;
           ind1--; ind2--;

        }
        return true;
       
    }
    
    public static int returnI(String s, int i){
        int skip=0;
        while(i>=0){
            if(s.charAt(i)=='#'){
                skip++;
                i--;
            }else if(skip>0){
                skip--;
                i--;
            }else{
                break;
            }
        }
        return i;
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		String s=sc.next();
        // char c[]=new char[n];
        // for(int i=0;i<n; i++){
        //     c[i]=sc.next();
        // }
        String k=sc.next();
		System.out.println(backspaceCompare(s,k));
      
	}
    
    
}
