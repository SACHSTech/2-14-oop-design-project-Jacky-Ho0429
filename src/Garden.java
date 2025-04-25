import java.util.ArrayList;
import java.util.List;

public class Garden {
    int id;
    String name;
    String location;
    private List<Plant> gardenPlants = new ArrayList<>();
    private List<GardenLog> gardenLog = new ArrayList<>();

    public Garden(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void addPlant(Plant plant) {
        gardenPlants.add(plant);
    }

    public List<Plant> getPlants() {
        return gardenPlants;
    }

    public void getPlantSize(Plant plant) {
        gardenPlants.add(plant);
    }

    public void addLog(GardenLog event) {
        gardenLog.add(event);
    }

    public String getLog(int logNumber) {
        return gardenLog.get(logNumber - 1).toString();
    }

    public int getLogSize() {
        return gardenLog.size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        return String.format("Id: %d\nName: %s\nLocation: %s\n", id, name, location);
    }
}