import java.util.ArrayList;
import java.util.List;

public abstract class Plant {

    protected int farmId;
    protected int plantId;
    protected String plantName;
    protected int waterInterval;

    public Plant(int farmId, int plantId, String plantName, int waterInterval) {
        this.farmId = farmId;
        this.plantId = plantId;
        this.plantName = plantName;
        this.waterInterval = waterInterval;
    }

    public int getFarmId() {
        return farmId;
    }

    public int getPlantId() {
        return plantId;
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
            if (farmLog.get(j).getPlantId() == plantId) {
                currentLogDate = farmLog.get(j).getDate();

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

    public abstract void displayInfo();
}
