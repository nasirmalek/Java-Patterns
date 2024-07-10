package Patterns;

public class new12 {
    public static void PrintPattern12(int n){
        int i,j;
        for (i=1;i<=n;i++){
            for (j=1;j<i;j++){
                System.out.print(" ");
            }
            for (j=i;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintPattern12(6);
    }
}
