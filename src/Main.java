import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<Farm> farmList = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        FileLoader.loadFarms("src\\CSV Files\\Farms.csv", farmList);
        FileLoader.loadPlants("src\\CSV Files\\Plants.csv", farmList);
        FileLoader.loadLogs("src\\CSV Files\\FarmLogs.csv", farmList);
        
        String name = "";

        while (true) {   
            System.out.println("Welcome Gardener, What Is Your Name? (Enter 0 to exit system)");
            name = userInput.readLine();
        
            
            if (name.equals("0")) {
                break;
            }
            
            FarmSystem.selectFarm(userInput);

            if (FarmSystem.farmId != 0) {
                FarmSystem.farmInteractions(farmList, userInput, name);
            }

        }
    }
}