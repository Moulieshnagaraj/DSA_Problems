/*
	
Arr={8,5,10,7,9,4,15,12,90,13}
k=4

take subarr of length of K and find the maximume element of the subarray.

Explanation: 
	{8,5,10,7} = 10
	{5,10,7,9} = 10
	{10,7,9,4} = 10
	{7,9,4,15} = 15
	{9,4,15,12}= 15
	{4,15,12,90}=90
	{15,12,90,13}=90

o/p: --> 10 10 10 15 15 90 90

*/


import java.util.*;
class Main {
    public static void maxOfAllSubarrOfSizeK(int[] arr,int k){
        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[0]; // 10
        int check=0;
        for(int i=0; i<k; i++){
            if(arr[i]>max){
                max=arr[i];
                check=i;
            }
        }
        // 10 10 10
        list.add(max);
        
        int i=1;//3
        int end=k;//6
        while(end < arr.length){ // 6 < 10
            if(i<=check){ //false 3 <= 2
                if(arr[end] > max){// true arr[5] > 10 --> 4 > 10
                    max=arr[end];
                    check=end;
                    list.add(max);
                }else{
                    list.add(max);
                }
            }
            else{
                int temp=arr[i]; // temp = arr[3] --> 7
                for(int j=i; j<=end; j++){ // j=3
                    if(arr[j] > temp){
                        temp=arr[j];
                        check=j;
                    }
                }
                max=temp;
                list.add(max);
            }
            i++;
            end++;
        }
        
        System.out.print(list);
    }
	public static void main(String args[]) {
		
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nums[]=new int[N];
        for(int i=0; i<N;i++){
            nums[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        maxOfAllSubarrOfSizeK(nums, k);
		
	}
    
    
}