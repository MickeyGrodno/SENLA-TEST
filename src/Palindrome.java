import java.util.Scanner;

/**
 * Created by sergei on 24.08.2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово для проверки на палиндромность.");
        String text = sc.nextLine();
        String textRev = new StringBuffer(text).reverse().toString();
        if (text.equalsIgnoreCase(textRev)) {
            System.out.println(String.format("Слово %s палиндромно.", text));
        } else {
            System.out.println(String.format("Слово %s не палиндромно.", text));
        }
    }
}
