import java.util.ArrayList;
import java.util.List;

public class Farm {
    private int id;
    private String name;
    private String country;
    private List<Plant> farmPlants = new ArrayList<>();
    private List<FarmLog> farmLog = new ArrayList<>();

    public Farm(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public void addPlant(Plant plant) {
        farmPlants.add(plant);
    }

    public void getPlants() {
        for(int i = 0; i < farmPlants.size(); i++) {
            System.out.println(farmPlants.get(i).displayInfo());
        }
    }
    
    public int getPlantSize() {
        return farmPlants.size();
    }

    public void addLog(FarmLog event) {
        farmLog.add(event);
    }

    public String getLog(int logNumber) {
        return farmLog.get(logNumber - 1).toString() + " located at " + country;
    }

    public int getLogSize() {
        return farmLog.size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return String.format("Id: %d\nName: %s\nLocation: %s\n", id, name, country);
    }
}