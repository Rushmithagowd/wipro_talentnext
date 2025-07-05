import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i =0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
       Arrays.sort(arr);
       System.out.print(arr);
	}

}
