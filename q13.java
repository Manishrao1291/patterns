import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i<n; i++){
           for(int j=0; j<=i; j++){
               System.out.print("*");
           }

            System.out.println();
        }
        for(int m =n; m>=0; m--) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
