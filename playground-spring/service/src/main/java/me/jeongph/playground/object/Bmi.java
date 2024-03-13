package me.jeongph.playground.object;

public record Bmi(
        double value
) {

    public Bmi {
        if (value < 0) {
            throw new IllegalArgumentException("BMI는 0 이상이어야 합니다.");
        }
    }

    public Bmi(Weight weight, Height height) {
        this(weight.kg().value() / Math.pow(height.cm().toMeter().value(), 2));
    }

}
