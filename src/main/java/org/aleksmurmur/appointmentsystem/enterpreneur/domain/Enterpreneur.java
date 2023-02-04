package org.aleksmurmur.appointmentsystem.enterpreneur.domain;

import jakarta.persistence.*;
import org.aleksmurmur.appointmentsystem.client.domain.Client;
import org.aleksmurmur.appointmentsystem.common.jpa.UUIDIdentifiableEntity;
import org.aleksmurmur.appointmentsystem.product.domain.Product;
import org.aleksmurmur.appointmentsystem.schedule.domain.Schedule;

import java.util.List;

@Entity
@Table(name = "enterpreneurs")
public class Enterpreneur extends UUIDIdentifiableEntity {

    private String firstName;
    private String lastName;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Schedule> schedules;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Client> clients;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;
    private Boolean deleted;
}
