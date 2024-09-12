package first;
import java.security.PublicKey;
import java.util.*;

import javax.sql.rowset.JoinRowSet;
public class array {
	static int val=10;//heap memory mai bnta hai static variable ,ye global hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
//		int [] arr=new int[5];
//		System.out.println(arr);
//		int []other=arr;//idhr nya array nahi bna heap mai wo bs ussi ko pint kr rha hai
//		int arry[];//ye type c,c++ mai usse hota hia pr sahi hai bhai
//		//hard code array
//		int a[]= {1,2,3,4,5};
//		int a[]=new int[] {1,2,3,4,5};
//	classname.variable name isse global variable aata hai local scope mai bhi
	//array ek class hai non-primitive hai to heap mai bnega.
	// garbage value---32-bit ka number generate number hota hai 0,1 k combo se 
		//maximum 
		public static int maximum(int[] arr) {
			int max=arr[0];
			for(int i=1;i<array.length;i++) {
				if(arr[i]>max) {
					max=array[i];
				}
			}return max;
		}
		
	}}



