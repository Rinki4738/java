package first;
import java.util.*;

public class ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
			
	        int n=sc.nextInt();
	        int num[]=new int[n];
	        int num2[]=new int[9];
	        for(int i=0;i<n;i++){
	            num[i]=sc.nextInt();
	            num2[i]=0;
	        }
	        int k=0,a=0;
	        int f=0;
	        for(int i=0;i<n;i++) {
	        	num2[num[i]]++;
	        	
	        	}
	        for(int i=0;i<9;i++) {
	        	if(num2[i]>0)
	        	System.out.println(i+" "+num2[i]);
	        }
	        	
	        
	        
	        
	}

}
