import java.util.Scanner;

public class TheHuntingGames__01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());

        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerOnePerson = Double.parseDouble(scanner.nextLine());
        double foodPerOnePerson = Double.parseDouble(scanner.nextLine());

        // 10
        // 7
        // 5035.5
        // 11.3
        // 7.2
        // 942.3
        // 500.57
        // 520.68
        // 540.87
        // 505.99
        // 630.3
        // 784.20
        // 321.21
        // 456.8
        // 330


        // 12
        // 6
        // 4430
        // 9.8
        // 5.5
        // 620.3
        // 840.2
        // 960.1
        // 220
        // 340
        // 674
        // 365
        // 345.5
        // 212
        // 412.12
        // 258
        // 496


        double allWater = day * people * waterPerOnePerson;
        double allFood = day * people * foodPerOnePerson;


        int count = 0;


        for (int i = 0; i < day; i++) {
            double lossEnergy = Double.parseDouble(scanner.nextLine());
            if (energy <= 0) {
                break;
            }

            energy = energy - lossEnergy;
            if (energy <= 0) {
                break;
            }
            count++;


            if (count % 2 == 0) {
                energy *= 1.05;
                allWater = allWater - (allWater * 0.30);

            }

            if (count % 3 == 0) {
                allFood = allFood - (allFood / people);
                energy = energy + (energy * 0.10);

            }
        }
        if (energy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", allFood, allWater);
        }


    }
}