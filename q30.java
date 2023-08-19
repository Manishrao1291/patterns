import java.util.Scanner;

public class q30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >=1; j--) {
                System.out.print(j+" ");

            }

            System.out.println();
        }
    }
}
