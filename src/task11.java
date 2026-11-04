import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        lcm(a,b);
    }

    public static void lcm(int a,int b){
        int n = 0;
        for (int i = 1; i < a*b+1; i++){
            if(i % a == 0 && i % b == 0){
                n = i;
                break;
            }
        }
        System.out.println(n);
    }

}