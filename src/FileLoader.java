import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class FileLoader {

    static String line;

    private FileLoader() {

        throw new AssertionError("Utility class should not be instantiated");

    }

    public static void loadReviews(String filePath, ArrayList<Farm> farmList) throws IOException {

        BufferedReader reviews = new BufferedReader(new FileReader(filePath));

        reviews.readLine();

        while ((line = reviews.readLine()) != null) {

            String[] columns = line.split(",", 4);

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

        reviews.close();

    }

}
