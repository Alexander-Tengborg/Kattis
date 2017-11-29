import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int listnumber = 1;

        while(scanner.hasNextInt()) {
            n = Integer.parseInt(scanner.nextLine());
            TreeMap<String, Integer> map = new TreeMap();
            for(int i = 0; i < n; i++) {
                String[] animalArr = scanner.nextLine().split(" ");
                String animal = animalArr[animalArr.length - 1].toLowerCase();

                int value = map.getOrDefault(animal, 0);
                map.put(animal, ++value);
            }
            if(!map.isEmpty()) {
                System.out.printf("List %d:\n", listnumber++);
                for (Map.Entry<String, Integer> pair : map.entrySet()) {
                    System.out.printf("%s | %d\n", pair.getKey(), pair.getValue());
                }
            }
        }
    }
}
