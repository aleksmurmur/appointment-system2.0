package org.aleksmurmur.appointmentsystem.client.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.aleksmurmur.appointmentsystem.booking.domain.Booking;
import org.aleksmurmur.appointmentsystem.common.jpa.UUIDIdentifiableEntity;

import java.util.List;

@Entity
public class Client extends UUIDIdentifiableEntity {

    private String name;
    private String phoneNumber;
    @OneToMany
    private List<Booking> bookings;
    private Boolean deleted;
}
