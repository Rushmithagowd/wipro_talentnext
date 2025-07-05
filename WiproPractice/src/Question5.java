import java.util.*;
public class Question5 {
	public static void largestsecondnum(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			else if(arr[i]<min) {
				min=arr[i];
				
			}
			
		}
		Arrays.sort(arr);
		int second=arr[arr.length-2];
		int secondmin=arr[1];
		System.out.println("maxnum= "+max);
		System.out.println("minnum= "+min);
		System.out.println("secondmin= "+secondmin);
		System.out.println("secondmax= "+second);
				
			
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i =0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		largestsecondnum(arr);
		sc.close();

	}

}
