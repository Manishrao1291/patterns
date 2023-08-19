import java.io.*;
import java.util.*;

public class qu11{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x < n; x++) {

            for(int y=0; y<n-x-1 ; y++){
                System.out.print('\t');
            }
            for(int j=0; j<x; j++){
                System.out.print("*\t\t");
            }
            System.out.println();
        }
    }
}
