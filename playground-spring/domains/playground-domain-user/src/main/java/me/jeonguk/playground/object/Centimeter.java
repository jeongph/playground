package me.jeonguk.playground.object;

public record Centimeter(
        double value
) {

    public static final String UNIT = "cm";

    public Centimeter {
        if (value < 0) {
            throw new IllegalArgumentException("길이는 0 이상이어야 합니다.");
        }
    }

    public Meter toMeter() {
        return new Meter(value / Math.pow(10, 2));
    }

}
