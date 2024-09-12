package first;

public class gradecard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int m=67;
//		if(m>=75) {
//			System.out.println("A");
//		}
//		else if(m>=65 && m<75) {
//			System.out.println("B");
//		}
//		else if(m>=55 && m<65) {
//			System.out.println("C");
//		}
//		else if(m>=45 && m<55) {
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("fail");
//		}
//		
		int a=7;
		int  f=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				f=1;
				break;
			}
	
		
		}if(f==0)
			System.out.println("prime");
		else {
			System.out.println("not prime");
		}
		
	}

}
