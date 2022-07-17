import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        int i = 2;
        boolean answ = true;
        for (; i * i <= number; i++){
            if (number % i == 0){
                answ = false;
                break;
            }
        }
        System.out.printf("%b %d\n",answ, i - 1);
        scanner.close();
    }
}
