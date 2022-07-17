public class Program {
    public static void main(String[] args) {
        int num = 479598;
        int answ = 0;
        answ += num % 10;
        num /= 10;
        answ += num % 10;
        num /= 10;
        answ += num % 10;
        num /= 10;
        answ += num % 10;
        num /= 10;
        answ += num % 10;
        num /= 10;
        answ += num % 10;
        System.out.println(answ);
    }
}
