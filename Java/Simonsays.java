import java.util.Scanner;

public class Simonsays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < amount; i++) {
            String sentence = scanner.nextLine();

            if(sentence.substring(0, 10).equals("Simon says")) {
                System.out.println(sentence.substring(11, sentence.length()).trim());
            }
        }
        scanner.close();
    }
}
