import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        int Star = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Star; j++) {
                System.out.print("* "); // Print stars on the same line
            }
            Star++;
            System.out.println(); // Move to the next line after printing stars for a row
        }
    }
}
