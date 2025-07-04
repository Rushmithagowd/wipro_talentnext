package java_fundamentals;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char[] a=name.toCharArray();
		for(char ch:a) {
		if(ch>='a'&&ch<='z') {
			System.out.print(Character.toUpperCase(ch));
		}
		else if(ch>='A'&&ch<='Z') {
			System.out.print(Character.toLowerCase(ch));
		}
		

	}

}
}