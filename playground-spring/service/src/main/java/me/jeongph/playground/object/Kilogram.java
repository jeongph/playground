package me.jeongph.playground.object;

public record Kilogram(
        double value
) {

    public Kilogram {
        if (value < 0) {
            throw new IllegalArgumentException("질량은 0 이상이어야 합니다.");
        }
    }

}
