package me.jeonguk.object;

public record Kilogram(
        double value
) {

    public static final String UNIT = "kg";

    public Kilogram {
        if (value < 0) {
            throw new IllegalArgumentException("질량은 0 이상이어야 합니다.");
        }
    }

    public Gram toGram() {
        return new Gram((int) (value * Math.pow(10, 3)));
    }

}
