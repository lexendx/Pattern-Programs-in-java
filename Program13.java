import java.util.Scanner;

class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt(); // Number of rows
        int star = 2 * n - 1; // Initial number of stars
        int space = 0;        // Initial number of spaces

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line

            star -= 2;  // Decrease the number of stars
            space++;    // Increase the number of spaces
        }
    }
}
