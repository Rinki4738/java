package first;
import java.util.*;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=2*n-3;
		int row=1;
		while(row<=n) {
			//star
			int s=1;
			while(s<=star) {
				System.out.print("* ");
				s++;
			}
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			if(star==n) {
				star--;
			}
			
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			star++;
			System.out.println();
			row++;
			space=space-2;
		}
	}

}
