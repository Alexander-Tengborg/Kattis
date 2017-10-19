import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(getQuadrant(x, y));

        scanner.close();
    }

    static String getQuadrant(int x, int y) {
        if(x > 0 && y > 0) {
            return "1";
        } else if(x < 0 && y > 0) {
            return "2";
        } else if(x < 0 && y < 0) {
            return "3";
        } else {
            return "4";
        }
    }
}
