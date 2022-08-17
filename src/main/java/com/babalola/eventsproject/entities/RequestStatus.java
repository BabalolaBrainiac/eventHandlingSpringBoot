package com.babalola.eventsproject.entities;

import javax.persistence.Entity;

public enum RequestStatus {
    PENDING, ACCEPTED, REJECTED, CANCELLED, EXPIRED, FULFILLED, OVERDUE
}
