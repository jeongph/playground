package me.jeonguk.playground.object;

public record Meter(
        double value
) {

    public static final String UNIT = "m";

    public Meter {
        if (value < 0) {
            throw new IllegalArgumentException("길이는 0 이상이어야 합니다.");
        }
    }

}
