import java.util.Scanner;

public class Twostones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stones = scanner.nextInt();

        String winner = (stones % 2 == 0) ? "Bob" : "Alice";

        System.out.println(winner);

        scanner.close();
    }
}
