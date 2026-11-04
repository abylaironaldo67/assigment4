import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        symbol(z);


    }


    public static int symbol(int z) {

        System.out.println(("#").repeat(z));
        return z;

    }

}