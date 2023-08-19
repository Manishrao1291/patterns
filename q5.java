import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Print  *
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
