package com.babalola.eventsproject.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private LocalDate dateCreated;
    private LocalDate expiresAt;
    private String location;

    @Enumerated(EnumType.STRING)
    private  RequestStatus status;

    @OneToMany
    private Set<RequestCreator> creator = new HashSet<>();

    @OneToMany
    private Set<RequestAcceptor> acceptor = new HashSet<>();


    @ManyToMany
    private Set<Category> categories;

}
