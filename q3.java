import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x <= n; x++) {
            for (int y = n; y > x; y--) {
                System.out.print("*" + '\t');
            }
            System.out.println();
        }
    }
}
