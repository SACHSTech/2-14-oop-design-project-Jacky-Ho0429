import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class FileLoader {

    static String line;

    private FileLoader() {

        throw new AssertionError("Utility class should not be instantiated");

    }

    public static void loadFarms(String filePath, ArrayList<Farm> farmList) throws IOException {
        BufferedReader farms = new BufferedReader(new FileReader(filePath));
        farms.readLine();

        while ((line = farms.readLine()) != null) {
            String[] columns = line.split(",");
            int id = Integer.parseInt(columns[0]);
            String name = columns[1];
            String country = columns[2];
            farmList.add(new Farm(id, name, country));
        }

        farms.close();

    }

    public static void loadPlants(String filePath, ArrayList<Farm> farmList) throws IOException {

        BufferedReader plants = new BufferedReader(new FileReader(filePath));
        plants.readLine();

        while ((line = plants.readLine()) != null) {

            String[] columns = line.split(",");
            int farmId = Integer.parseInt(columns[0]);
            int plantId = Integer.parseInt(columns[1]);
            String plantName = columns[2];
            int waterInterval = Integer.parseInt(columns[3]);
            int lifeSpan = Integer.parseInt(columns[4]);

            for (int i = 0; i < farmList.size(); i++) {
                if (farmList.get(i).getId() == farmId) {
                    if (lifeSpan > 2) {
                        farmList.get(i).addPlant(new Perennial(farmId, plantId, plantName, waterInterval, lifeSpan));
                    } else if (lifeSpan == 2) {
                        farmList.get(i).addPlant(new Biennial(farmId, plantId, plantName, waterInterval, lifeSpan));
                    } else {
                        farmList.get(i).addPlant(new Annual(farmId, plantId, plantName, waterInterval, lifeSpan));
                    }
                }
            }

        }

        plants.close();

    }

    public static void loadLogs(String filePath, ArrayList<Farm> farmList) throws IOException {
        
        BufferedReader logs = new BufferedReader(new FileReader(filePath));
        logs.readLine();

        while ((line = logs.readLine()) != null) {
            String[] columns = line.split(",");
            int farmId = Integer.parseInt(columns[0]);
            String farmName = columns[1];
            String farmerName = columns[2];
            int date = Integer.parseInt(columns[3]);
            int plantId = Integer.parseInt(columns[4]);
            String event = columns[5];

            FarmLog farmLog = new FarmLog(farmId, farmName, farmerName, date, plantId, event);

            for (int i = 0; i < farmList.size(); i++) {
                if (farmList.get(i).getId() == farmId) {
                    farmList.get(i).addLog(farmLog);
                }
            }
        }
        
        logs.close();

    }
}
