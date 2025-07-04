package java_fundamentals;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender.equals("female")) {
			if(age>=1&&age<=58) {
				System.out.print("the percentage of interest is 8.2%");
			}
			else if(age>=59&&age<=100){
				System.out.print("the percentage of interest is 9.2%");
			
				
			}}
		else if(gender.equals("male")) {
			if(age>=1&&age<=58) {
				System.out.print("the percentage of interest is 8.2%");
			}
			else if(age>=59&&age<=100){
				System.out.print("the percentage of interest is 9.2%");
			
				
			}
			
		}
		}

}
