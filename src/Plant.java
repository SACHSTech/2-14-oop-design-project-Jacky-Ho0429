import java.util.ArrayList;
import java.util.List;

public abstract class Plant {

    private String farmName;
    private String plantName;
    private int waterInterval;

    public Plant(String farmName, String plantName, int waterInterval) {
        this.plantName = plantName;
        this.waterInterval = waterInterval;
    }

    public String getFarmName() {
        return farmName;
    }

    public String getPlantName() {
        return plantName;
    }

    public int getWaterInterval() {
        return waterInterval;
    }

    public Boolean isWatered(List<FarmLog> farmLog) {
        
        int lastWaterDate = 0;
        int lastDate = 0;
        int currentLogDate = 0;
        for (int j = 0; j < farmLog.size(); j++) {
            if (farmLog.get(j).getPlant().equals(plantName)) {
                currentLogDate = Integer.parseInt(farmLog.get(j).getDate());
                if (farmLog.get(j).getEvent().contains("watered")) {
                    if (currentLogDate > lastWaterDate) {
                        lastWaterDate = currentLogDate;
                    }
                }
                lastDate = currentLogDate;
            }
        }

        if ((lastDate - lastWaterDate) > waterInterval) {
            return true;
        } else {
            return false;
        }

    }

    
    
}
