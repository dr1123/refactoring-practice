package practice02;

public abstract class Bird {

    public static final double NORWEGIAN_FACTOR = 1.3;
    public static final double BASE_SPEED = 60.0;
    protected double factor;

    public abstract double getSpeed() ;

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }
}
