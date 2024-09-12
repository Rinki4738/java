package first;
import java.util.*;
public class nikita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int c=0;
			while(n>=m) {
				if(n==m) {
					c=1;
					break;
				}else {
					m=m+2;
				}
			}if(c==1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			
		}

	}

}
