import java.util.*;
public class Question2 {
	public static void maxmin(int[] arr) {
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
		System.out.println("Maximum: " + max);
	    System.out.println("Minimum: " + min);
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i =0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		maxmin(arr);

	}

}
