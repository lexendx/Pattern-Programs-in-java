import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int mid = (n + 1) / 2; // Middle row

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' based on the conditions
                if (i == 1 || i == n || j == 1 || j == n || (i == mid && j != n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for other cells
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
