package com.efx.Science.model;

import java.time.LocalDate;
public class timeBetween {

    private LocalDate startTime;

    private LocalDate endTime;

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
}
