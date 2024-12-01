import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int a = sc.nextInt();
        getPattern(a);

    }
    public static void getPattern(int a){
for(int i = 1; i<=a; i++){
    for(int j = 1;j<=a;j++){
System.out.print(j + " ");
    }
    System.out.println();
}

    }
}
