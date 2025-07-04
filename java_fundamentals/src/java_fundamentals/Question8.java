package java_fundamentals;

import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char[] a=name.toCharArray();
		Arrays.sort(a);
		
		System.out.println(new String(a));
	}

}
