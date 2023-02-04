package org.aleksmurmur.appointmentsystem.schedule.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import org.aleksmurmur.appointmentsystem.common.jpa.DateIdentifiableEntity;
import org.aleksmurmur.appointmentsystem.common.jpa.UUIDIdentifiableEntity;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Schedule extends DateIdentifiableEntity {

    private LocalDate date;
    private Boolean dayOff = false;

    public Schedule(@NotNull LocalDate id) {
        super(id);
    }

    public Schedule() {
        super();
    }
}
