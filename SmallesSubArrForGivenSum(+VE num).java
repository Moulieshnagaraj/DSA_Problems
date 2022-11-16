
/*

Arr={3,2,5,5,2,3,10}

k=10

subarry with sum 10 = {3,2,5} , {5,5}, {5,2,3} ,{10} 

smallest subarray with sum "K" is = {10}

o/p: Should be length of the subarray 
o/p --> 1

**** ONLY APPLICABLE FOR NON-NAGATIVE NUMBERS ***

Techinique: SLIDING WINDOW AND TWO POINTER
TimeComplexity: O(N)
SpaceComplexity: O(1)


*/

import java.util.*;

class Main {
    public static int returnSmallestSubarr(int[] arr, int k){
        int min=arr.length-1;
        int sum=0;
        int num;
        int i=0;//6
        int j=0;// 6
        while(j<arr.length){ // 6
            sum=sum+arr[j];// 10+10==20
            if(sum==k){ // true
                num=j-i; // num=5-3=2
                min=Math.min(num+1, min); // min = (3,2)==>2
            }
            
            while(sum > k){ // true
                sum=sum-arr[i]; // sum=12-2=10
                if(sum==k){
                    num=j-i; // num=6-5==>1
                    min=Math.min(num, min); // (1,2) ==> 1
                }
                i++;
            }
            j++;
        }
        return min;
    }
    
    
    
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] num=new int[N];
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(returnSmallestSubarr(num, k));
        
    }
}
