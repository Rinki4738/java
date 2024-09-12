package first;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util .*;

import javax.swing.plaf.multi.MultiInternalFrameUI;



public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	//8	
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=5;j++) {
//			if(i==j||i+j==6) {
//				System.out.print("* ");
//			}
//			else {
//				System.out.print("  ");
//			}
//			
//		}System.out.println();
//	}
		//29
	
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i+j==6) {
//					System.out.print(i);
//				}else if(i+j>6) {
//					System.out.print("0");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			for(int j=1;j<=5;j++) {
//				if(i-j==1) {
//					System.out.print(i);
//				}else if(i-j>1) {
//					System.out.print("0");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//		}
		//33
		
		
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=10;j++) {
//				if(j==10) {
//					System.out.print("0");
//				}else if(i+j>=11 && j<10) {
//					System.out.print(j);
//				}else {
//					System.out.print(" ");
//				}
//			}
//			for(int j=9;j>=1;j--) {
//				if(i+j>=11) {
//					System.out.print(j);
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	
		
//			
//			
//		}
		
		//12
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>i;j--) {
//				System.out.print(" ");
//			}for(int j=1;j<2*i;j++) {
//				if(j%2==0) {
//					System.out.print("!");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//			}
			
		//32
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<2*i;j++) {
//				if(j%2==0) {
//					System.out.print("* ");
//				}else {
//					System.out.print(i+" ");
//				}
//			}
//			
//			System.out.println();
//		}for(int i=4;i>=1;i--) {
//			for(int j=1;j<2*i;j++) {
//				if(j%2==0) {
//					System.out.print("* ");
//				}else {
//					System.out.print(i+" ");
//				}
//			}System.out.println();
//		}
//		
		//13
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}System.out.println();
//		}for(int i=1;i<5;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print("* ");
//			}System.out.println();
//		}
		//14
		
//		for(int i=1;i<=5;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}System.out.println();
//		}
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=4;j>=i;j--) {
//				System.out.print("* ");
//			}System.out.println();
//		}
//		15
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=2;j<2*i;j++) {
//				System.out.print("  ");
//			}for(int j=n;j>=i;j--) {
//				System.out.print("* ");
//			}System.out.println();
//		}
//		for(int i=2;i<=n;i++) {
//			for(int j=2*(n-1);j>2*i-2;j--) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//				
//			}System.out.println();
//		}
		
	//16	
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=n-1;j>=i;j--) {
//				System.out.print("  ");
//			}for(int j=n;j>=i;j--) {
//				System.out.print("* ");
//			}System.out.println();
//		}
//		for(int i=2;i<=n;i++) {
//			for(int j=1;j<i;j++) {
//				System.out.print("  ");
//			}for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}System.out.println();
//		}
		//23
//		int n=6;
//		for(int i=1;i<=n;i++) {
//			for(int j=n-1;j>=i;j--) {
//				System.out.print("  ");
//			}for(int j=1;j<=2*i-1;j++) {
//				System.out.print("1 ");
//			}System.out.println();
//		}
		//24
//		int n=6;
//		for(int i=1;i<=n;i++) {
//			for(int j=n-1;j>=i;j--) {
//				System.out.print("  ");
//			}for(int j=1;j<=2*i-1;j++) {
//				System.out.print(i+" ");
//			}System.out.println();
//		}
		
		//26
//		int n=5;
//		//int k=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=n-1;j>=i;j--) {
//				System.out.print("  ");
//			}for(int j=1;j<=2*i-1;j++) {
//				System.out.print(j +" ");
//			}System.out.println();
//		}
		
		//10
//	int n=6;	
//	for(int i=1;i<=n;i++) {
//		for(int j=n;j>i;j--) {
//			System.out.print(" ");
//		}
//		for(int j=2;j<=2*i;j++) {
//			System.out.print("*");
//		}System.out.println();
//	}
		//20
//		int n=9;
//		for(int i=1;i<=n/2+1;i++) {
//			for(int j=1;j<=n/2+1;j++) {
//				if(i+j==(n/2+2)) {
//					System.out.print("* ");
//					
//				}else {
//					System.out.print("  ");
//				}
//			}for(int j=1;j<=n/2;j++) {
//				if(i-j==1) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}for(int i=1;i<=n/2;i++) {
//			for(int j=1;j<=n/2+1;j++) {
//				if(j-i==1) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			for(int j=1;j<=n/2;j++) {
//				if(i+j==n/2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//				
//		}
// 19		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i+j<=5||j-i>=3) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=7;j++) {
//				if(j-i<=1||i+j>=7) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}
//	27	
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//			}for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}for(int j=i-1;j>=1;j--) {
//				System.out.print(j);
//			}System.out.println();
//		}
		
	//28	
//	for(int i=1;i<=5;i++) {
//		for(int j=5;j>=i;j--) {
//			System.out.print(" ");
//		}for(int j=i;j<2*i;j++) {
//			System.out.print(j);
//		}
//		for(int j=2*i-2;j>=i;j--) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
		
		int n=9;
		int row=1;
		int star=n/2;
		int space=1;
		while(row<=n) {
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}int p=1;
			while(p<=star) {
				System.out.print("* ");
				p++;
			}if(row<=n/2) {
				star--;
				space=space+2;
			}else {
				star++;
				space=space-2;
			}
			row++;
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
