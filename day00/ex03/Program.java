import java.util.Scanner;

public class Program {
    private static void print_answ(long num, int week_num)
    {
        if (num == 0)
            return;
        print_answ(num/10, week_num - 1);
        System.out.print("Week " + week_num + " ");
        for(int i = 0; i < num%10; i++)
            System.out.print("=");
        System.out.println(">");
    }

    private static int min(int a, int b)
    {
        if (a < b)
            return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        long num = 0;
        int min;
        int week_num = 1;
        int help;
        while (true)
        {
            min = 10;
            str = sc.nextLine();
            if (str.equals("42"))
                break;
            if (!str.equals("Week " + week_num)){
                System.err.println("IllegalArgument" + str);
                System.exit(-1);
            }
            for(int i = 0; i < 5; i++) {
                if (sc.hasNextInt()) {
                    help = sc.nextInt();
                    if (help < 1 || help > 9) {
                        System.err.println("IllegalArgument" + str);
                        System.exit(-1);
                    }
                    min = min(min, help);
                }
            }
            str = sc.nextLine();
            if (!str.equals(""))
            {
                System.err.println("IllegalArgument" + str);
                System.exit(-1);
            }
            num += min;
            num *= 10;
            week_num++;
            if (week_num == 19)
                break;
        }
        print_answ(num/10, week_num - 1);
        sc.close();
    }

}
