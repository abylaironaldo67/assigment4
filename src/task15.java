import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        palindrome(x);
    }

    public static void palindrome(int x) {
        int original = x;
        String a = String.valueOf(original);;
        String n = "";
        String s = String.valueOf(x);
        for (int i = s.length()-1; i > -1; i--){
            int digit = s.charAt(i) - '0';
            n = n + digit;

        }
        if (n.equals(s)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

}
