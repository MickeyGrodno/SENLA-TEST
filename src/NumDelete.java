import java.util.Scanner;

/**
 * Created by sergei on 24.08.2017.
 */
public class NumDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Удаление чисел из текста. Введите текст вперемешку с числами.");
        String text = sc.nextLine();
        System.out.println(String.format("Введенная строка: %s", text));
        System.out.println(String.format("Полученная строка: %s", text.replaceAll("\\d", "")));
    }
}
