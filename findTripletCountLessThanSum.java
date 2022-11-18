
import java.util.*;
class Main {
    public static int findTripletCountLessThanSum(int[] arr, int k){
        
        int count=0;
        Arrays.sort(arr);
       
        for(int i=0; i<arr.length-2; i++){
   
            int start=i+1;
            int end=arr.length-1;
            while(start < end){
                if(arr[i]+arr[start]+arr[end] >= k){
                    end--;
                }
                else{
                    count=count+(end-start);
                    start++;
                }
                
            }
        }
        
        return count;
        
        
    }
	public static void main(String args[]) {
		
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N;i++){
            nums[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();

        System.out.print(findTripletCountLessThanSum(nums, k));
		
	}
    
    
}