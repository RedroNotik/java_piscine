import java.util.Scanner;

public class Program {
    private static boolean is_prime(int num) {
        int i = 2;
        for (; i * i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int get_num(int num){
        int answ = 0;
        while (num > 0) {
            answ += num % 10;
            num /= 10;
        }
        return answ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, counter = 0;
        while (true) {
            num = scanner.nextInt();
            if (num == 42)
                break;
            if (is_prime(get_num(num)))
                counter++;
        }
        System.out.println("Count of coffee-request - " + counter);
        scanner.close();
    }
}
