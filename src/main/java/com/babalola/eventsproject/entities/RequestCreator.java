package com.babalola.eventsproject.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class RequestCreator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private Set<User> creator;

    @OneToMany
    private Set<Request> requests = new HashSet<>();
}
