package first;

import java.util.Scanner;

public class niki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();


			
			if(n>=m && (n-m)%2==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}
	}

}
