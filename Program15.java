import java.util.Scanner;

class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int mid = (n + 1) / 2; // Calculate the middle row
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || i == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for the rest
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
