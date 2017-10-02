import java.util.ArrayList;
import java.util.Scanner;

public class Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountOfTests = sc.nextInt();

        int[] distinctCities = new int[amountOfTests];

        for(int i = 0; i < amountOfTests; i++) {
            int amountOfTrips = sc.nextInt();
            ArrayList<String> cities = new ArrayList<>();

            for(int j = 0; j < amountOfTrips; j++) {
                String city = sc.next();

                if(!cities.contains(city)) {
                    cities.add(city);
                }
            }
            distinctCities[i] = cities.size();
        }

        for(int d : distinctCities) {
            System.out.println(d);
        }
        sc.close();
    }
}
