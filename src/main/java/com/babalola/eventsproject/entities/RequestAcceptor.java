package com.babalola.eventsproject.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class RequestAcceptor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @ManyToOne
    private Request acceptedRequest;

    private String acceptanceCriteria;

}
