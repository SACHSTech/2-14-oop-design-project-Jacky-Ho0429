import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FarmSystem {

    static int farmId = 0;
    static int choice = -1;
    static int waterInterval;
    static int lifeSpan;
    static int date;
    static int plantId;
    static int eventChoice;
    static String plantName;
    static String event;

    public static void selectFarm(BufferedReader userInput) throws IOException {
        farmId = -1;
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

    public static void farmInteractions(ArrayList<Farm> farmList, BufferedReader userInput, String farmerName) throws IOException {
        ArrayList<Integer> plantIds = farmList.get(farmId).getPlantIds();
        choice = -1;
        while (choice > 5 || choice < 0) {
            System.out.println("What would you like to do? Enter a number from 1 - 4: ");
            System.out.println("1. Check plants at the farm");
            System.out.println("2. Check the logs of the farm");
            System.out.println("3. Add a new plant to the farm");
            System.out.println("4. Add a new garden log");
            System.out.println("5. Check If A Plant Needs Watering");
            System.out.println("0. To Exit");

            choice = Integer.parseInt(userInput.readLine());

            switch (choice) {

                case 1:
                    farmList.get(farmId).getPlants();
                    break;

                case 2:
                    farmList.get(farmId).getLogs();
                    break;

                case 3:
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

                case 4:
                    eventChoice = -1;
                    date = -1;
                    plantId = -1;
                    while (date > 365 || date < 1) {
                        System.out.println("What day of the year is it? Provide a number from 1 - 365");
                        date = Integer.parseInt(userInput.readLine());
                    }

                    while (!plantIds.contains(plantId)) {
                        System.out.println("What plant have you interacted with? Please provide its ID");
                        plantId = Integer.parseInt(userInput.readLine());
                    }

                    farmList.get(farmId).getPlants();

                    while (eventChoice > 4 || eventChoice < 1) {
                        System.out.println("What did you do to the plant? Choose a number from 1 - 4");
                        System.out.println("1. Watered");
                        System.out.println("2. Harvested");
                        System.out.println("3. Fertilized");
                        System.out.println("4. Removed Nearby Weeds");
                        eventChoice = Integer.parseInt(userInput.readLine());
                    }

                    switch (eventChoice) {
                        case 1:
                            event = "watered";
                            break;

                        case 2:
                            event = "harvested";
                            break;

                        case 3:
                            event = "fertilized";
                            break;

                        case 4:
                            event = "removed nearby weeds";
                            break;

                    }

                    farmList.get(farmId).addLog(new FarmLog(farmId + 1, farmList.get(farmId).getName(), farmerName, date, plantId, event));
                    System.out.println("New log added to " + farmList.get(farmId).getName() + ".");
                    break;

                case 5:
                    farmList.get(farmId).isPlantsWatered(plantIds);
                    break;

                case 0:
                    break;

            }
        }
    }
}
