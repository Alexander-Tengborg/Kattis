import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jon = sc.next();
        String doctor = sc.next();

        String value = (jon.length() >= doctor.length()) ? "go" : "no";

        System.out.println(value);

        sc.close();
    }
}
