import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FarmSystem {

    static int farmId = 0;
    static int choice = -1;
    static int waterInterval;
    static int lifeSpan;
    static String plantName;

    public static void selectFarm(BufferedReader userInput) throws IOException {
        while (farmId > 7 || farmId < 0) {
            System.out.println("Which garden will you be working at today? Enter a number from 1 - 7): ");
            System.out.println("1. Kyojh Farm");
            System.out.println("2. The Ho Farm");
            System.out.println("3. Mash Farm");
            System.out.println("4. Gethsemane Farm");
            System.out.println("5. Dundun Farm");
            System.out.println("6. Not A Farm");
            System.out.println("7. Potato Famine");
            System.out.println("0. To Exit");
            farmId = Integer.parseInt(userInput.readLine());
        }
    }

    public static void farmInteractions(ArrayList<Farm> farmList, BufferedReader userInput) throws IOException {
        while (choice > 4 || choice < 0) {
            System.out.println("What would you like to do? Enter a number from 1 - 4: ");
            System.out.println("1. Check plants at the farm");
            System.out.println("2. Add a new plant to the farm");
            System.out.println("3. Add a new garden log");
            System.out.println("4. Check If A Plant Needs Watering");
            System.out.println("0. To Exit");

            choice = Integer.parseInt(userInput.readLine());

            switch (choice) {

                case 1:
                    farmList.get(farmId).getPlants();
                    break;

                case 2:
                    System.out.println("What is the name of the plant you are adding to the farm?");
                    plantName = userInput.readLine();

                    System.out.println("How often does this plant need watering?");
                    waterInterval = Integer.parseInt(userInput.readLine());

                    System.out.println("What is the lifespan of this plant?");
                    lifeSpan = Integer.parseInt(userInput.readLine());

                    if (lifeSpan > 2) {
                        farmList.get(farmId).addPlant(new Perennial(farmId, farmList.get(farmId).getPlantSize() + 1, plantName, waterInterval, lifeSpan));
                    } else if (lifeSpan == 2) {
                        farmList.get(farmId).addPlant(new Biennial(farmId, farmList.get(farmId).getPlantSize() + 1, plantName, waterInterval, lifeSpan));
                    } else {
                        farmList.get(farmId).addPlant(new Annual(farmId, farmList.get(farmId).getPlantSize() + 1, plantName, waterInterval, lifeSpan));
                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 0:
                    break;
            }
        }
    }
}
