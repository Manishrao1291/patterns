import java.util.Scanner;

public class q31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;
        for (int i = 0; i < n; i++) {

            for (int j = n; j >0; j--) {
                if(i+1==j)
                    System.out.print("* ");
                else
                    System.out.print(j +" ");

            }

            System.out.println();
        }
    }
}
