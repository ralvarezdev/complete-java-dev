package oop.composition;

public class Lamp {
    private final String style;
    private final boolean battery;
    private final int globRating;

    public Lamp(String style, boolean hasBattery, int globRating) {
        this.style = style;
        this.battery = hasBattery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
