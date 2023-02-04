package org.aleksmurmur.appointmentsystem.schedule.domain;

import jakarta.persistence.Entity;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class WorkSchedule extends Schedule{

    private LocalDateTime timeFrom;
    private LocalDateTime timeTo;

    public WorkSchedule(@NotNull LocalDate id) {
        super(id);
    }

    public WorkSchedule() {

    }
}
