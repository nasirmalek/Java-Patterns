package Patterns;
// import java.util.*;
public class new4 {
    public static void PrintPattern4(int n){
        int i,j;

        for (i = n; i >= 1;i--){
            for (j = 1;j <=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        PrintPattern4(n);
    }
}

