import java.util.Scanner;

/**
 * Created by sergei on 23.08.2017.
 */
public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 1;
        int c;
        System.out.println("Проверка интревала на наличие чисел Фибоначчи. Введите целое число большее 1");
        int x = sc.nextInt();
        while (x < 2) {
            System.out.println("Введено не верное число. Введите целое число большее 1.");
            x = sc.nextInt();
        }
        System.out.println(String.format("Числами Фибоначчи в интервале от 1 до %s являются: ", x));
        System.out.print(a + " " + b + " ");
        while (true) {
            c = a + b;
            if (c <= x) {
                System.out.print(c + " ");
                a = b;
                b = c;
            } else {
                break;
            }
        }
    }
}
