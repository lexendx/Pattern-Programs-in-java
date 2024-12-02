import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int mid = n / 2 + 1; // Calculate midpoint (works for both even and odd n)

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Loop through columns
            for (int j = 1; j <= n; j++) {
                // Print '*' if we're at the middle row or column
                if (i == mid || j == mid) {
                    System.out.print("* "); // Use print to keep on the same line
                } else {
                    System.out.print("  "); // Print spaces otherwise
                }
            }
            // After completing each row, print a newline
            System.out.println();
        }

        sc.close(); // Close scanner after input is done
    }
}
