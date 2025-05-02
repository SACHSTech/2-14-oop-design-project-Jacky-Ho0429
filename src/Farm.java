import java.util.ArrayList;
import java.util.List;

public class Farm {
    private int id;
    private String name;
    private String country;
    private ArrayList<Plant> farmPlants = new ArrayList<>();
    private ArrayList<FarmLog> farmLog = new ArrayList<>();

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

    public void isPlantsWatered(ArrayList<Integer> ids) {
        for (Plant plant : farmPlants) {
            if (ids.contains(plant.getPlantId())) {
                System.out.println(plant.getPlantName() + " (Watered: " + plant.isWatered(farmLog) + ")");
            }
        }
    }
    
    
    public ArrayList<Integer> getPlantIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        for (Plant plant : farmPlants) {
            ids.add(plant.getPlantId());
        }
        return ids;
    }

    public int getPlantSize() {
        return farmPlants.size();
    }

    public void addLog(FarmLog event) {
        farmLog.add(event);
    }

    public void getLogs() {
        for (FarmLog log : farmLog) {
            String plantName = "";
            for (Plant plant : farmPlants) {
                if (plant.getPlantId() == log.getPlantId()) {
                    plantName = plant.getPlantName();
                    break;
                }
            }
            System.out.println(plantName + " - " + log.toString() + " located at " + country);
        }
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