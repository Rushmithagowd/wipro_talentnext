package java_fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<0||b<0) {
			System.out.print(false);
		}
		else {
			int l1=a%10;
			int l2=b%10;
			if(l1==l2) {
				System.out.print(true);
				
			}
			else {
				System.out.print(false);
			}
			
		}
		
			
		}

	}


