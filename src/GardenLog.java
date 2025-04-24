import java.util.ArrayList;
import java.util.List;

public class GardenLog {
    private int gardenId;
    private String gardenerName;
    private String date;
    private String plant;
    private String event;

    public GardenLog(int gardenId, String gardenerName, String date, String plant, String event) {
        this.gardenId = gardenId;
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
}
