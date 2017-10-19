import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if(minute < 45) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour--;
            }
            minute += 15; // 60 - 45 - minute
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
