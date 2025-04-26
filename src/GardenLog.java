import java.util.ArrayList;
import java.util.List;

public class GardenLog {
    private int gardenId;
    private String gardenName;
    private String gardenerName;
    private String date;
    private String plant;
    private String event;

    public GardenLog(int gardenId, String gardenName, String gardenerName, String date, String plant, String event) {
        this.gardenId = gardenId;
        this.gardenName = gardenName;
        this.gardenerName = gardenerName;
        this.date = date;
        this.event = event;
    }

    public int getGardenId() {
        return gardenId;
    }

    public String getName() {
        return gardenerName;
    }

    public String getDate() {
        return date;
    }

    public String getPlant() {
        return plant;
    }

    public String getEvent() {
        return event;
    }

    public String toString() {
        return gardenerName + " " + event + " on " + date + " at " + gardenName;
    }    
}
