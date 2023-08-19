import java.io.*;
import java.util.*;

public class q2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int x=0; x<=n; x++){
            for(int y=0; y<x; y++){
                System.out.print("*"+'\t');
            }
            System.out.println();
        }

    }
}
