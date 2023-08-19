import java.util.Scanner;

public class  q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int star = n;
        for(int i=1;i<=n*2-1 ;i++){
            // This loop is for space

            int curSpace = 1;
            while(curSpace <= space){
                System.out.print("  ");
                curSpace++;
            }

            // This loop for start;
            int curStar = 1;
            while(curStar <= star){
                System.out.print("* ");
                curStar++;
            }
            if(i < n ){
                space+=2;
                star--;
            }else {
                space-=2;
                star++;
            }
            System.out.println();
        }

    }
}
