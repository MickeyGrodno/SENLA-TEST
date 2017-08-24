import java.util.Scanner;

/**
 * Created by sergei on 24.08.2017.
 */
public class NodNok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, nod, nok, a1, b1;

        System.out.println("Поиск НОД и НОК двух чисел.");
        System.out.println("Введите первое число.");
        a = sc.nextInt();
        a1 = a;
        System.out.println("Введите второе число.");
        b = sc.nextInt();
        b1 = b;
        while (a != b) {
            if (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            } else {
                nod = a + b;
                System.out.println(String.format("НОД чисел %s и %s = %s", a1, b1, nod));
                nok = a1 * b1 / nod;
                System.out.println(String.format("НОК чисел %s и %s = %s", a1, b1, nok));
                break;
            }
        }
        if (a == b) {
            nod = b;
            System.out.println(String.format("НОД чисел %s и %s = %s", a1, b1, nod));
            System.out.println(String.format("НОK чисел %s и %s = %s", a1, b1, nod));
        }
    }
}
