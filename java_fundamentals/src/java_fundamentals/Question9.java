package java_fundamentals;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char[] a=name.toCharArray();
		for(char ch:a ) {
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.print("Alaphabets");}
			else if(ch>='0'&&ch<='9') {
			 System.out.print("Digits");}
			 else{
				System.out.print("Special Characters"); }
			 }
			}
}


