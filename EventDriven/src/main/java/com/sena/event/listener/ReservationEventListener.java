package com.sena.event.listener;

import com.sena.event.ReservationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {

    @EventListener
    public void reservationEventHandler(ReservationEvent reservationEvent) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Event Listener -> " + reservationEvent.getSource().toString());
    }

}