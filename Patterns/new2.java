package Patterns;
// import java.util.*;

public class new2 {
    public static void PrintPattern2(int n)
    {
        int i,j;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= n-i;j++){
                System.out.print(" ");
            }
            for ( j = 1; j <= i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n = 6;
        PrintPattern2(n);
    }
        
}
