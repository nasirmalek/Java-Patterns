package Patterns;

public class new3 {
    public static void PrintPattern3(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        PrintPattern3(n);
    }
}
