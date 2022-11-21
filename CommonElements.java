
/*

n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.

Has to manage duplicate elements without using datastructures.

Time: O(n+m+k)
Space: O(n+m+k);

Techniques: 3-pointer, intialize at start. and check it exist in temp. 
*/


import java.util.*;
class Main {
    public static void CommonElements(int[] A, int[] B,int[] C){
		ArrayList<Integer> temp=new ArrayList<Integer>();
        
		int i=0, j=0, k=0;
		while(i<n1 && j<n2 && k<n3){
		    if(A[i]==B[j]&&A[i]==C[k]){
		        if(!temp.contains(A[i])){
		            temp.add(A[i]);
		        }
		        i++;j++;k++;
		    }
		    
		    else if(A[i]<B[j]){
		        i++;
		    }else if(B[j]<C[k]){
		        j++;
		    }else{
		        k++;
		    }
		}
	
		System.out.println(temp);
		
    }
    
    public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N; i++){
            nums[i]=sc.nextInt();
        
        }
		
		int M=sc.nextInt();
        int nums2[]=new int[M];
        for(int i=0; i<M; i++){
            nums2[i]=sc.nextInt();
        
        }
		
		int P=sc.nextInt();
        int nums3[]=new int[P];
        for(int i=0; i<P; i++){
            nums3[i]=sc.nextInt();
        
        }
        // int k=sc.nextInt();
		CommonElements( nums,nums2,nums3);
		
	}
    
    
