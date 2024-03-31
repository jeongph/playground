package me.jeonguk.playground.common.object;

import java.time.LocalDateTime;

public record DateTimePeriod(
        LocalDateTime start,
        LocalDateTime end
) {

    public DateTimePeriod {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("start must be before end");
        }
    }

    public boolean isOverlap(DateTimePeriod other) {
        return start.isBefore(other.end()) && end.isAfter(other.start());
    }

    public boolean isSame(DateTimePeriod other) {
        return start.equals(other.start()) && end.equals(other.end());
    }

    public boolean isZero() {
        return start.equals(end);
    }

}
