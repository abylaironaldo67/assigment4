import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = 2 * x - 1;
        pyramide(x,z);

    }

    public static void pyramide(int x, int z) {
        for (int i = 1; i <= z; z -= 2){
            System.out.println(("*").repeat(z));
        }

    }

}
