import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        factorial(x);
    }

    public static void factorial(int x) {
        int count = 1;
        for (int i = 1; i <= x; i++){

            count *= i;
        }
        System.out.println(count);
    }

}