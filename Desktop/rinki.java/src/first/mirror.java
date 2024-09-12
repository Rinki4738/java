package first;
import java.security.PublicKey;
import java.util.*;

import javax.swing.plaf.ActionMapUIResource;

public class mirror {
	public static int factorial(int a) {
		int f=1;
		for(int i=a;i>1;i--) {
			 f=f*i;
		}
		return f;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int row=1;
//		int star=1;
//		int space=n-1;
//		int val=1;
//		while(row<=2*n-1) {
//			int h=1;
//			while(h<=space) {
//				System.out.print("  ");
//				h++;
//			}
//			int i=1;
//			int p=val;
//			while(i<=star) {
//				System.out.print(p+" ");
//				if(i<=star/2)
//					p++;
//				else {
//					p--;
//				}
//				i++;
//			}
//			if(row<n) {
//			star+=2;
//			space--;
//			val++;}
//			else {
//				star-=2;
//				space++;
//				val--;
//			}
//			
//			
//			System.out.println();
//			row++;
//			}
//			int a=0;
//			int b=1;
//			for(int i=1;i<=n;i++) {
//				System.out.println(a);
//				int c=a+b;
//				a=b;
//				b=c;
//				
//			}
//		int divisor=36;
//		int dividend=60;
//		while(dividend % divisor!=0) {
//			int rem=dividend % divisor;
//			dividend=divisor;
//			divisor=rem;
//		}
//		System.out.println(divisor);
//			
//			int row=1;
//			int star=n/2+1;
//			int space=-1;
//			while(row<=n) {
//				int i=1;
//				while(i<=star) {
//					System.out.print("*");
//					i++;
//				}
//				int j=1;
//				while(j<=space) {
//					System.out.print(" ");
//					j++;
//				}
//				int k=1;
//				if(row==1||row==n) {
//					k++;
//				}
//				while(k<=star) {
//					System.out.print("*");
//					k++;
//				}
//				
//				if(row<=n/2) {
//					star--;
//					space=space+2;
//				}else {
//					star++;
//					space=space-2;
//				}
//				row++;
//				System.out.println();
//			}
//		
//		
//	
		
		
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=i;j++) {
//				int k=factorial(i)/(factorial(j)*factorial(i-j));
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		
		//conversion of destination to source when one of them is decimal like if octal to binary or vice -versa 
		
		//then first convert into decimal and then binary.
//		int mul=1;
//		int sum=0;
//		int des=10;
//		int sour=2;
//		while(n>0) {
//			int r=n%des;
//			sum=sum+mul*r;
//			n=n/des;
//			mul=mul*sour;
//			
//		}System.out.println(sum);
//		long l=234578911l;  //yhn literal ka type long kr diya hai l lga kr literal int se long kr diya
//		byte b=sc.nextByte();
//		short sS=sc.nextShort();
//		long lK=sc.nextLong();
//		int a=032;   //octal hai kyuki 0 se shuru hai
//		System.out.println(a);
//	//	int f=0238;  //error
//		double d=16.5;
//		float f=8.2f;
//		d=sc.nextDouble();
//		f=sc.nextFloat();
//		boolean b1=true;
//		b1=sc.nextBoolean();
//		//char -256 each vhar is given certain code i.e.unicode 
////		vowel-5
////		consonant-19 w and y nhi hote
		char th='a';
		System.out.println((int)(th));
		
//		for(byte b=0;b<128;b++) {
//			System.out.println(b);
//		infinite loop chalega
		
		
		
		
		}
	}


