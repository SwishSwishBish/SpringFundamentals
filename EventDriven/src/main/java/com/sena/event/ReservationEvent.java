package com.sena.event;

import org.springframework.context.ApplicationEvent;

public class ReservationEvent extends ApplicationEvent {

    public ReservationEvent(Object source) {
        super(source);
    }
}
