import java.util.*;
public class Main {
    public static int solve(String s)
    {
        HashMap<Character, Integer> ans=new HashMap<>();
        for(int i=s.length()-1; i>=0; i--){
            ans.put(s.charAt(i), ans.getOrDefault(s.charAt(i),0)+1);

        }
        for(int i=0; i<s.length(); i++){
            if(ans.get(s.charAt(i))==1) return i;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int N=sc.nextInt();
        // int B=sc.nextInt();
        // int[] A=new int[N];
        // for(int i=0;i<N;i++)
        // {
        //     A[i] =sc.nextInt();
        // }
        String D=sc.next();
        System.out.print(solve(D));
    }
}


