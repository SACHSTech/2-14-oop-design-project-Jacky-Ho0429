public class Annual extends Plant {
    private int dailyWater;
    private int lifeSpan;
    
    public Annual(String name, int dailyWater, int lifeSpan) {
        super(name);
        this.dailyWater = dailyWater;
        this.lifeSpan = lifeSpan;
    }

}
