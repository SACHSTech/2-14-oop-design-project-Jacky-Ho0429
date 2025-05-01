import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static ArrayList<Farm> farmList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        FileLoader.loadFarms("src\\CSV Files\\Farms.csv", farmList);
        FileLoader.loadPlants("src\\CSV Files\\Plants.csv", farmList);
        FileLoader.loadLogs("src\\CSV Files\\FarmLogs.csv", farmList);
 
        /** User Interface Guideline
         * 
         *  Welcome Gardener!
         * 
         *  Which garden will you be working at today? Please provide the id (1 - 7):
         *  1. Kyojh Garden
         *  2. The Ho Garden
         *  3. Mash Potatoes
         *  4. Joel's Garden
         *  5. Dundun Garden
         *  6. Not A Farm
         *  7. Potato Famine
         * 
         *  What would you like to do? Enter a number from 1 - 4:
         *  1. View plants at the garden
         *  2. Add a new plant to the garden 
         *  3. Add a new garden log
         *  4. Check if a plant needs watering
         * 
         *  What is the name of the plant you would like to add?
         *  
         *  What is the type of plant? Enter a number from 1 - 3:
         *  1. Annual
         *  2. Biennial
         *  3. Perennial
         *  
         *  Here are plants that need watering:
         *  
         *
         */
    }
}