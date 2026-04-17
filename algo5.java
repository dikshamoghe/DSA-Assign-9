import java.util.*;
class QuickSortCode{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		f(arr,0,arr.length-1);

		System.out.println();
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.print("]");
	}
	static void f(int[]arr,int low, int high){
		if(low>=high){
			return;
		}
		int pivot=p(arr,low,high);
		f(arr,low,pivot-1);
		f(arr,pivot+1,high);
	}

	static int p(int[]arr,int low,int high){
		int pivot=arr[low];
		int i=low;
		int j=high;
		
		while(i<j){
			while(i<=high && arr[i]<=pivot){
				i++;
			}
			while(j>=low && arr[j]>pivot){
				j--;
			}
			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
				int temp=arr[low];
				arr[low]=arr[j];
				arr[j]=temp;

		return j;
	}
}