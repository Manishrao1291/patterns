import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;

        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=(i-1)*2; j++){
                System.out.print("\t");
            }
            for(int k =i; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
