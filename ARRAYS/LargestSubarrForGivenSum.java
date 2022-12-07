/*
  
  Arr={1,2,4,8,12,45,21,8,2}
  K=10
  o/p: 8+2 =10 so, it shoud return start and end index of the subarray --> start: 7 and End: 8
  
  
  Efficient approach: Kadane's algorithm
  
  Time complexity: O(N)
  Space complexity: O(1)




*/





import java.util.*;
class Main {
	public static void main(String args[]) {
		
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int maxi=arr[0];
        int start=0;
        int end=arr.length-1;      
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                end=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        int checkSum = 0;
        start=end;
        while(true){
            checkSum+=arr[start];
            if(checkSum==maxi){
                break;
            }
            start--;
        }
        System.out.print("Maxi: "+maxi+" start: "+start+" end: "+end);
		
	}
    
    
}
