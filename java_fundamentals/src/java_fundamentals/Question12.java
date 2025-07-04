package java_fundamentals;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.length() == 0) {
            System.out.println("Invalid code");
            return;
        }

        char ch = input.charAt(0);  // Get first character of the input

        if (ch == 'R' || ch == 'r') {
            System.out.print("Red");
        } else if (ch == 'B' || ch == 'b') {
            System.out.print("Blue");
        } else if (ch == 'G' || ch == 'g') {
            System.out.print("Green");
        } else if (ch == 'O' || ch == 'o') {
            System.out.print("Orange");
        } else if (ch == 'Y' || ch == 'y') {
            System.out.print("Yellow");
        } else if (ch == 'W' || ch == 'w') {
            System.out.print("White");
        } else {
            System.out.print("Invalid code");
        }

        sc.close();
    }
}
