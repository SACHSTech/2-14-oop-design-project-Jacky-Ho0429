import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Farm f1 = new Farm(1, "Kyojh Farm", "Canada");
        Farm f2 = new Farm(2, "The Ho Farm", "BJ County"); // Submitted By Preston Wong
        Farm f3 = new Farm(3, "Mash Farm", "Potat"); // Submitted By George Du
        Farm f4 = new Farm(4, "Gethsemane", "Isreal"); // Submitted By Joel Menezes
        Farm f5 = new Farm(5, "Dundun Farm", "Dundun Land"); // Submitted By Athena Yeung
        Farm f6 = new Farm(6, "Not A Farm", "Pluto"); //Submitted By Lucianp
        Farm f7 = new Farm(7, "Potato Famine", "Dublin"); //Submitted By Christopher Xia

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

        FarmLog l1 = new FarmLog(5, f5.getName(), "Jacky", "2", p1.getName(), "watered the " + p1.getName() );
        FarmLog l2 = new FarmLog(5, f5.getName(), "Jacky", "5", p1.getName(), "found out the " + p1.getName() + " died");
        FarmLog l3 = new FarmLog(5, f5.getName(), "Jacky", "8", p1.getName(), "watered the " + p1.getName());
        
        if (l1.getFarmId() == 5) {
            f5.addLog(l1);
        } else if (l1.getFarmId() == 6) {
            f5.addLog(l1);
        }

        if (l2.getFarmId() == 5) {
            f5.addLog(l2);
        } else if (l2.getFarmId() == 6) {
            f6.addLog(l2);
        }

        f5.addPlant(p1);

        System.out.println(f5.getLog(1));
        System.out.println(f5.getLog(2));
        System.out.println(f5.checkPlants());
        f5.addLog(l3);
        System.out.println(f5.getLog(3));
        System.out.println(f5.checkPlants());
    }
}