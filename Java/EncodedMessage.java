import java.util.Arrays;
import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine()); // sc.nextInt() "äter" inte upp \n, därför så kan nästa värde man läser in bli fel. (Om man använder sc.nextInt())

        for(int i = 0; i < testCases; i++) {
            String encodedText = sc.nextLine();

            int wordLength = (int) Math.sqrt(encodedText.length());

            String[] decodedArray = new String[wordLength];
            Arrays.fill(decodedArray, ""); // Fyller arrayen med en tom string, då en string arrays vanliga värde är null

            for(int j = 0; j < encodedText.length(); j++) {
                int index = decodedArray.length - 1 - j % wordLength;
                decodedArray[index] += encodedText.charAt(j);
            }

            for (String decodedText : decodedArray) {
                System.out.print(decodedText);
            }
            System.out.println();
        }
        sc.close();
    }
}
