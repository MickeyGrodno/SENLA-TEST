import java.util.Scanner;

/**
 * Created by sergei on 23.08.2017.
 */
public class Lines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax, ay, bx, by, cx, cy, dx, dy;
        double v1, v2, v3, v4;
        System.out.println("Проверка отрезков на пересечение друг с другом. Введите координаты отрезков через пробел: Ax Ay Bx By Cx Cy Dx Dy.");
        String input = sc.nextLine();

        String[] textMas = input.split(" ");

        int[] numMas = new int[textMas.length];
        for (int i = 0; i < numMas.length; i++) {
            numMas[i] = Integer.parseInt(textMas[i]);
        }
        ax = numMas[0];
        ay = numMas[1];
        bx = numMas[2];
        by = numMas[3];
        cx = numMas[4];
        cy = numMas[5];
        dx = numMas[6];
        dy = numMas[7];

        System.out.println("Координаты отрезков:");
        System.out.println(String.format("AB - A(%s;%s); B(%s;%s);", ax, ay, bx, by));
        System.out.println(String.format("CD - C(%s;%s); D(%s;%s);", cx, cy, dx, dy));

        v1 = (dx - cx) * (ay - cy) - (dy - cy) * (ax - cx);
        v2 = (dx - cx) * (by - cy) - (dy - cy) * (bx - cx);
        v3 = (bx - ax) * (cy - ay) - (by - ay) * (cx - ax);
        v4 = (bx - ax) * (dy - ay) - (by - ay) * (dx - ax);

        if (v1 * v2 < 0 && v3 * v4 < 0) {
            System.out.println("Отрезки пересекаются.");
        } else {
            System.out.println("Отрезки не пересекаются.");
        }
    }
}
