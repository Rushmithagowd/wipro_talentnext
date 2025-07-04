package java_fundamentals;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 1️⃣

        System.out.print("Enter a number: "); // 2️⃣
        int num = sc.nextInt();               // 3️⃣

        boolean isPrime = true;               // 4️⃣

        if (num <= 1) {                       // 5️⃣
            isPrime = false;                  // 6️⃣
        } else {
            for (int i = 2; i <= num / 2; i++) {   // 7️⃣
                if (num % i == 0) {                // 8️⃣
                    isPrime = false;              // 9️⃣
                    break;                        // 🔟
                }
            }
        }

        if (isPrime) {                         // 🔹
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }

        sc.close();                            // 🔚
    }
}
