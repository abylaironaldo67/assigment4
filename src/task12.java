import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNum(n);
    }

    public static void reverseNum(int n){
        String x = "";
       while(n >0){
            int z = n % 10;
            x += z;
            n = n / 10;

        }
        System.out.println(x);
    }

}

