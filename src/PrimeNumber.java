import java.util.Scanner;

/**
 * Created by sergei on 23.08.2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число большее 1 для проверки интервала на наличие простых чисел. Отсчёт ведется с 1.");

        int x = sc.nextInt();
        while (x < 2) {
            System.out.println("Введено не верное число. Введите целое число большее 1.");
            x = sc.nextInt();
        }

        System.out.println("Простыми числами являются: ");

        for (int i = 2; i <= x; i++) {
            boolean isSimple = true;
            if (i == 2) {
                System.out.print(" " + i + ",");
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isSimple = false;
                    }
                }
                if (isSimple) {
                    System.out.print(" " + i + ",");
                }
            }
        }
    }
}