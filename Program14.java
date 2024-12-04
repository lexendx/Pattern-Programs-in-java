import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int star = 1;
        int space = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  "); // Use print instead of println to stay on the same line
            }
            for (int j = 1; j <= star; j++) { // Declare j here as well
                System.out.print("*    ");
            }
            System.out.println(); // Move to the next line after each row
            star++;
            space--;
        }
    }
}
