import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Garden g1 = new Garden(1, "Kyojh Garden", "Ontario");
        Garden g2 = new Garden(2, "The Ho Garden", "BJ Avenue"); // Submitted By Preston Wong
        Garden g3 = new Garden(3, "Mash Potatoes", "Potat"); // Submitted By George Du
        Garden g4 = new Garden(4, "Joel's Garden", "Joeshmo"); // Submitted By Joel Menezes
        Garden g5 = new Garden(5, "Dundun Garden", "Dundun Land"); // Submitted By Athena Yeung
        Garden g6 = new Garden(6, "Not A Farm", "Pluto"); //Submitted By Lucianp
        Garden g7 = new Garden(7, "Potato Famine", "Dublin"); //Submitted By Christopher Xia

        Biennial p1 = new Biennial("Dundun Fruit", 2, 2);

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

        GardenLog l1 = new GardenLog(5, g5.getName(), "Jacky", "2024-07-29", p1.getName(), "watered the " + p1.getName() );
        GardenLog l2 = new GardenLog(5, g5.getName(), "Jacky", "2024-07-30", p1.getName(), "found out the " + p1.getName() + " died");

        if (l1.getGardenId() == 5) {
            g5.addLog(l1);
        } else if (l1.getGardenId() == 6) {
            g5.addLog(l1);
        }

        if (l2.getGardenId() == 5) {
            g5.addLog(l2);
        } else if (l2.getGardenId() == 6) {
            g6.addLog(l2);
        }

        g5.addPlant(p1);

        System.out.println(g5.getLog(1));
        System.out.println(g5.getPlants());
        System.out.println(g5.checkPlants());
        System.out.println(g5.checkPlants());
    }
}