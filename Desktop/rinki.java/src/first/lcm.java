package first;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner sc=new Scanner(System.in);
//	        int n=sc.nextInt();
//	        int s=0;
//	        int ss=pf(n);
//	        while(n>0){
//	            int r=n%10;
//	            s+=r;
//	            n=n/10;
//	        }
//
//	        if(ss==s){
//	            System.out.println(1);
//	        }else{
//	             System.out.println(0);
//	        }
//
//
//	    }public static int pf(int n){
//	        int i=2;
//	        int s=0;
//	        while(n>1){
//	            if(n%i==0){
//	                n=n/i;
//	                if(i>10){
//	                	int j=i;
//	                    while(j>0){
//	                        
//	                    int r=j%10;
//	                    s+=r;
//	                    j=j/10;
//	                    }
//
//	                }
//	                s+=i;
//	            }else{
//	                i++;
//	            }
//	        }
//	        return s;
//		Scanner sc=new Scanner(System.in);
//        int s=sc.nextInt();
//        int d=sc.nextInt();
//        int n=sc.nextInt();
//    
//    int dd=10;
//    int i=0;
//    int sum=0;
//    while(n>0){
//        int r=n%dd;
//        sum+=r*Math.pow(s,i);
//        n=n/dd;
//        i++;
//    }
//    System.out.println(sum);
//    int j=0;
//    int k=0;
//    s=10;
//    while(sum>0){
//        int r=sum%d;
//        k+=r*Math.pow(s,j);
//        sum=sum/d;
//        j++;
//    }
//    System.out.println(k);
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) {
			int a=sc.nextInt();
			int h=sc.nextInt();
			int m=0;
			while(a%h!=0) {
				a++;
				m++;
				
			}
			System.out.println(m);
			
			
		}
		
		
		
}

	    }