package first;
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,6,4,5};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	// java is call by value	

	}
	public static int maximum(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
			
		}return max;
	}
	public static void reverse(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
	}
	public static void reverse(int arr[]) {
		
		for(int i=0;i<arr.length/2;i++) {
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
	}
	public static void rotate(int arr[],int k) {
		int n=arr.length;
		k=k%n;
		while(k>0) {
			int item=arr[n-1];
			for(int i=n-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}arr[0]=item;
			k--;
		}
	}
	

}
