package me.jeongph.playground.object;

public record Gram(
        int value
) {

    public static final String UNIT = "g";

    public Gram {
        if (value < 0) {
            throw new IllegalArgumentException("질량은 0 이상이어야 합니다.");
        }
    }

}
