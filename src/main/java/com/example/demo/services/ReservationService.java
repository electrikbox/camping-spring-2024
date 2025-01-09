package com.example.demo.services;

import com.example.demo.models.Reservation;
import com.example.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(int id) {
        return reservationRepository.findById(id).get();
    }

    public Reservation saveReservation(Reservation Reservation) {
        return reservationRepository.save(Reservation);
    }

    public void deleteReservation(int id) {
        reservationRepository.deleteById(id);
    }
}
