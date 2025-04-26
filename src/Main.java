import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Garden g1 = new Garden(1, "Kyojh Garden", "Markham, Ontario");
        Garden g2 = new Garden(2, "The Ho Garden", "BJ Avenue"); // Submitted By Preston Wong
        Garden g3 = new Garden(3, "Mash Potatoes", "Potat"); // Submitted By George Du
        Garden g4 = new Garden(4, "Joel's Garden", "Joeshmo"); // Submitted By Joel Menezes
        Garden g5 = new Garden(5, "Dundun Garden", "Dundun Land"); // Submitted By Athena Yeung
        Garden g6 = new Garden(6, "Not A Farm", "Pluto"); //Submitted By Lucianp
        Garden g7 = new Garden(7, "Potato Famine", "Dublin, Ireland"); //Submitted By Christopher Xia

        Fruit p1 = new Fruit("apple tree", "fruit" , 2);
        Fruit p2 = new Fruit("banana tree", "fruit" , 2);
        Fruit p3 = new Fruit("orange tree", "fruit" , 2);
        Fruit p4 = new Fruit("pear tree", "fruit" , 2);


        GardenLog l1 = new GardenLog(1, g1.getName(), "Jacky", "2024-07-29", p1.getName(), "watered the " + p1.getName() );
        GardenLog l2 = new GardenLog(1, g1.getName(), "Jacky", "2024-07-30", p1.getName(), "found out the " + p1.getName() + " died");

        g1.addLog(l1);
        g1.addLog(l2);

        g1.addPlant(p1);
        g1.addPlant(p2);
        g1.addPlant(p3);
        g1.addPlant(p4);

        System.out.println(g1.getLog(1));
        System.out.println(g1.getLog(2));
        System.out.println(g1.getPlants());
    }
}