package java_fundamentals;
import java.util.*;

public class Question21 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int original = sc.nextInt();

		        int number = original;
		        int reversed = 0;

		        while (number != 0) {
		            int digit = number % 10;
		            reversed = reversed * 10 + digit;
		            number = number / 10;
		        }

		        if (original == reversed) {
		            System.out.println(original + " is a Palindrome.");
		        } else {
		            System.out.println(original + " is Not a Palindrome.");
		        }
		    }
		

	

}
