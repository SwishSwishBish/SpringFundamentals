package com.sena.service;

import com.sena.controller.HotelBookRequest;
import com.sena.event.ReservationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    final
    ApplicationEventPublisher applicationEventPublisher;

    public ReservationService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Async
    public void publishReservationEvent(HotelBookRequest hotelBookRequest){
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        applicationEventPublisher.publishEvent(new ReservationEvent(hotelBookRequest));
    }
}
