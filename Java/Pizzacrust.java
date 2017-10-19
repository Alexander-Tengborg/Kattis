import java.util.Scanner;

public class Pizzacrust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int radius = scanner.nextInt();

        int crust = scanner.nextInt();

        double area1 = Math.pow(radius, 2) * Math.PI;

        double area2 = Math.pow(radius - crust, 2) * Math.PI;

        double percentage = area2 / area1 * 100;

        System.out.println(percentage);

        scanner.close();
    }
}
