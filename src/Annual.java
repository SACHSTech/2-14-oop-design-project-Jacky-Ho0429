public class Annual extends Plant {
    private int lifeSpan;
    
    public Annual(String name, int waterInterval, int lifeSpan) {
        super(name, waterInterval);
        this.lifeSpan = lifeSpan;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

}
