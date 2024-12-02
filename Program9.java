import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Loop through rows
            for (int j = 1; j <= n; j++) { // Loop through columns
                // Print '*' for primary diagonal (i == j) or secondary diagonal (i + j == n + 1)
                if (i + j == n + 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces otherwise
                }
            }
            System.out.println(); // Move to the next line after completing the row
        }
        sc.close(); // Close the scanner
    }
}
