package Patterns;

public class new7 {
    public static void PrintPattern7(int n){
        int i,j;

        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 7;
        PrintPattern7(n);
    }
}

