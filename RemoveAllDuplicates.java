

/*

arr={1,2,2,3,4,4,4,5,5}
o/p:{1,2,3,4,5}

TimeComplexity: O(N)
SpaceComplexity: O(1)

In some where, we have return index+1 untill the array modified.

*/



import java.util.*;
class Main {
    public static void removeAllDuplicates(int[] arr){
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
                
            }
            j++;
            
        }
        // return i+1; Modified array "arr" untill i-1
        
        for (int k=0; k<=i; k++){
            System.out.println(arr[k]);
        }
        
    }
	public static void main(String args[]) {
		
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N;i++){
            nums[i]=sc.nextInt();
        }

        removeAllDuplicates(nums);
		
	}
    
    
}