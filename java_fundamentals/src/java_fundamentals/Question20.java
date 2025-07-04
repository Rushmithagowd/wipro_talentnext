package java_fundamentals;
import java.util.*;
public class Question20 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int reversed = 0;

    while (number != 0) {
        int digit = number % 10;          // get last digit
        reversed = reversed * 10 + digit; // build reversed number
        number = number / 10;             // remove last digit
    }

    System.out.println("Reversed number: " + reversed);

}
}
