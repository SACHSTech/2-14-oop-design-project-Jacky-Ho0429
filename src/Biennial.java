public class Biennial extends Plant {
    private int dailyWater;
    private int lifeSpan;

    public Biennial(String name, int dailyWater, int lifeSpanYears) {
        super(name);
        this.dailyWater = dailyWater;
        this.lifeSpan = lifeSpan;
    }

}
