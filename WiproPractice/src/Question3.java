import java.util.*;

public class Question3 {
    public static void search(int[] arr, int n) {
        boolean found = false;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (n == arr[i]) {
                System.out.print(arr[i]); // print the element if found
                found = true;
                break; // stop searching after first match
            }
        }

        if (!found) {
            System.out.println(-1); // print -1 only once if not found
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // number to search
        int x = sc.nextInt();       // size of array
        int[] arr = new int[x];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();  // reading array elements
        }

        search(arr, n); // fixed: pass both arguments
        sc.close();
    }
}
