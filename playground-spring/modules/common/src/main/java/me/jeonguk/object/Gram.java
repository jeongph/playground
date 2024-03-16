package me.jeonguk.object;

public record Gram(
        int value
) {

    public static final String UNIT = "g";

    public Gram {
        if (value < 0) {
            throw new IllegalArgumentException("질량은 0 이상이어야 합니다.");
        }
    }

    public Kilogram toKilogram() {
        return new Kilogram(value / Math.pow(10, 3));
    }

}
