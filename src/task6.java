import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        primeNumber(x,z);


    }

    public static void primeNumber(int x,int z) {
        int num = 0;
        for (int i = x; i <= z; i++) {
            if (isPrime(i)) {
                num+=1;

            }
        }
        System.out.println(num);

        }

     public static boolean isPrime(int n) {
        if (n < 2) return false;
        int count = 0;
        for (int i = 2; i <= n-1; i++){
            if (n % i == 0) {
                count += 1;
            }
        }
         return count == 0;
     }

    }

