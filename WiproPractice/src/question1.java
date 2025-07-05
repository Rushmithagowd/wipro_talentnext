import java.util.*;
public class question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a =new int[n];
		int sum=0;
		for(int i=0;i<=n-1;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<=n-1;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		System.out.println(sum/n);
		
	}

}
