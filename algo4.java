import java.util.*;
class MergeSort{
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

		System.out.println();
		f(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void f(int []arr, int low , int high){
		if(low>=high){
			return;
		}
		int mid= (low+high)/2;
		f(arr,low,mid);
		f(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	public static void merge(int []arr, int low ,int mid, int high){
		int[]merged=new int[high-low+1];
	
		int blue=low;
		int green=mid+1;
		int red=0;
		while(blue<=mid && green<=high){

			if(arr[blue]<=arr[green]){
				merged[red]=arr[blue];
				red++;
				blue++;
			}else{
				merged[red]=arr[green];
				red++;
				green++;
			}

		}
		while(blue<=mid){
			merged[red]=arr[blue];
			red++;
			blue++;
		}
		while(green<=high){
			merged[red]=arr[green];
			red++;
			green++;
		}
		for(int i=0;i<merged.length;i++){
			arr[low+i]=merged[i];
		}
	}


}


















