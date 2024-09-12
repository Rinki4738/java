package first;
import java.util.*;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int k=1;
		int sum=0;
		while(n>0) {
			int rem=n%n2;
			sum+=rem*k;
			n=n/n2;
			k*=n1;
			
		}System.out.println(sum);
		
		
		
		
			
		
		
		
	}

}
