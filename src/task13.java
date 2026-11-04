import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printXPattern(x);
    }

    public static void printXPattern(int x){
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<=x; j++){
                if (i + j == x+1 || i == j     ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}