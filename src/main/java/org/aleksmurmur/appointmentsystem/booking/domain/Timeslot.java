package org.aleksmurmur.appointmentsystem.booking.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import org.aleksmurmur.appointmentsystem.common.jpa.UUIDIdentifiableEntity;
import org.aleksmurmur.appointmentsystem.schedule.domain.WorkSchedule;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Timeslot extends UUIDIdentifiableEntity {

    private LocalDateTime timeFrom;
    private Duration duration;
    @ManyToOne
    private WorkSchedule workSchedule;
    private TimeslotStatus timeslotStatus;
}
