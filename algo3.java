import java.util.*;
class InsertionSort{
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
		// Algorithm
		for(int i=1;i<n;i++){
			int currentEle=arr[i];
			int left= i-1;
		
			while(left>=0 && arr[left]>currentEle){
				arr[left+1]=arr[left];
				left--;
			}
			arr[left+1]=currentEle;
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}