package Patterns;

public class new8 {
    public static void PrintPattern8(int n){
        int i,j;
        
        for (i=n;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintPattern8(7);
    }
}
