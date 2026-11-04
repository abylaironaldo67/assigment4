import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        transformDigits(x);


    }

    public static void  transformDigits(long x){
        String n = "";
        String s = String.valueOf(x);
        for (int i = 0; i <= s.length()-1; i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 == 0){
                digit += 1;
                n += digit;


            }else{
                digit -= 1;
                n += digit;
            }

        }
        System.out.println(n);

    }

}
