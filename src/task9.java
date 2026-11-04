import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armStrong(n);

    }

    public static void armStrong(int n){
        int sum = 0;
        int original = n;
        while (n > 0){
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n /10;

        }

        if (sum == original) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

}