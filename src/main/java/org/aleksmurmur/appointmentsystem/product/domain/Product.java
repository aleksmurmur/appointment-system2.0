package org.aleksmurmur.appointmentsystem.product.domain;

import jakarta.persistence.Entity;
import org.aleksmurmur.appointmentsystem.booking.domain.Timeslot;
import org.aleksmurmur.appointmentsystem.common.jpa.UUIDIdentifiableEntity;

import java.time.Duration;
import java.util.UUID;

@Entity
public class Product extends UUIDIdentifiableEntity {


    private String name;
    private String description;
    private Duration duration;
    private Long price;
    private Boolean deleted;

}
