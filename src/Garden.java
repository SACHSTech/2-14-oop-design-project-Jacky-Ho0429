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

    public String getPlants() {
        String plantList = "";
        for (int i = 0; i < gardenPlants.size(); i++) {
            Plant plant = gardenPlants.get(i);
            plantList += plant.getName();
            if (i != gardenPlants.size() - 1) {
                plantList += ", ";
            }
        }
        return plantList;
    }

    public String checkPlants() {
        String plantList = "";
        boolean watered = false;
        for (int i = 0; i < gardenPlants.size(); i++) {
            Plant plant = gardenPlants.get(i);
            String plantName = gardenPlants.get(i).getName();
            for (int j = 0 ; j < gardenLog.size(); j++) {
                if (gardenLog.get(j).getPlant() == plantName) {
                    if (gardenLog.get(j).getEvent().contains("watered")) {
                        watered = true;
                        break;
                    } else {
                        watered = false;
                    }
                }
            }
            plantList += plant.getName() + " (Needs Water: " + gardenPlants.get(i).needWatering(!watered) + ")";
            if (i != gardenPlants.size() - 1) {
                plantList += ", ";
            }
        }
        return plantList;
    }

    public void getPlantSize(Plant plant) {
        gardenPlants.add(plant);
    }

    public void addLog(GardenLog event) {
        gardenLog.add(event);
    }

    public String getLog(int logNumber) {
        return gardenLog.get(logNumber - 1).toString() + " located at " + location;
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