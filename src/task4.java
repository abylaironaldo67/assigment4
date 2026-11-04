import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int z = 1;
        printMatrix(n,m,z);

    }


    public static void printMatrix(int n,int m,int z){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print(z + " ");

                z += 1;





            }
            System.out.println();
        }


    }
}