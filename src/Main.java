import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Garden g1 = new Garden(1, "Kyojh Garden", "Markham");
        Garden g2 = new Garden(2, "The Ho Garden", "BJ Avenue"); // Submitted By Preston Wong
        Garden g3 = new Garden(3, "Mash Potatoes", "Potat"); // Submitted By George Du
        Garden g4 = new Garden(4, "Joel's Garden", "Markham"); // Submitted By Joel Menezees

        Plant p1 = new Plant("apple tree");

        GardenLog l1 = new GardenLog(1, g1.getName(), "Jacky", "2024-07-29", p1.getName(), "watered the " + p1.getName() );
        GardenLog l2 = new GardenLog(1, g1.getName(), "Jacky", "2024-07-30", p1.getName(), "found out the " + p1.getName() + " died");

        g1.addLog(l1);
        g1.addLog(l2);

        g1.addPlant(p1);

        System.out.println(g1.getLog(1));
        System.out.println(g1.getLog(2));
    }
}