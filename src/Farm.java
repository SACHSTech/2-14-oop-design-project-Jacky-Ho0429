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

    public String getPlants() {
        String plantList = "";
        for (int i = 0; i < farmPlants.size(); i++) {
            Plant plant = farmPlants.get(i);
            plantList += plant.getName();
            if (i != farmPlants.size() - 1) {
                plantList += ", ";
            }
        }
        return plantList;
    }

    public String checkPlants() {
        String plantDisplayList = "";

        for (int i = 0; i < farmPlants.size(); i++) {
            int lastWaterDate = 0;
            int lastDate = 0;
            int currentLogDate = 0;
            boolean needWater = false;
            for (int j = 0; j < farmLog.size(); j++) {
                if (farmLog.get(j).getPlant().equals(farmPlants.get(i).getName())) {
                    currentLogDate = Integer.parseInt(farmLog.get(j).getDate());
                    if (farmLog.get(j).getEvent().contains("watered")) {
                        if (currentLogDate > lastWaterDate) {
                            lastWaterDate = currentLogDate;
                        }
                    }
                    if (currentLogDate > lastDate) {
                        lastDate = currentLogDate;
                    }
                }
            }

            if ((lastDate - lastWaterDate) > farmPlants.get(i).getWaterInterval()) {
                needWater = true;
            } else {
                needWater = false;
            }

            plantDisplayList += farmPlants.get(i).getName() + " (Needs Water: " + needWater + ")";
            if (i != farmPlants.size() - 1) {
                plantDisplayList += ", ";
            }
        }
        return plantDisplayList;
    }

    public void getPlantSize(Plant plant) {
        farmPlants.add(plant);
    }

    public void addLog(FarmLog event) {
        farmLog.add(event);
    }

    public String getLog(int logNumber) {
        return farmLog.get(logNumber - 1).toString() + " located at " + location;
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

    public String getLocation() {
        return location;
    }

    public String toString() {
        return String.format("Id: %d\nName: %s\nLocation: %s\n", id, name, location);
    }
}