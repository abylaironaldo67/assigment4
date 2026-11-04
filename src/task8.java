import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        decimalToBinary(x);
    }

    public static void decimalToBinary(int x) {
            String binary = "";

            while (x > 0) {
                int remainder = x % 2;
                binary = remainder + binary;
                x = x / 2;
            }

            System.out.println(binary);
        }


    }



