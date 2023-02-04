package org.aleksmurmur.appointmentsystem.booking.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import org.aleksmurmur.appointmentsystem.product.domain.Product;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Booking extends Timeslot{

    @OneToMany
    private List<Product> products = new ArrayList<>();
    private BookingStatus bookingStatus;

}
