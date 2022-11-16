
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