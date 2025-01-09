package com.example.demo.controllers;

import com.example.demo.models.Reservation;
import com.example.demo.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reservations")
public class ReservationController {

    @Autowired
    private ReservationService ReservationService;

    @GetMapping
    public List<Reservation> getReservations() {
        return ReservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") int id) {
        return ReservationService.getReservationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable("id") int id) {
        ReservationService.deleteReservation(id);
    }

    @PostMapping()
    public Reservation saveReservation(@RequestBody Reservation Reservation) {
        return ReservationService.saveReservation(Reservation);
    }

    @PatchMapping()
    public Reservation updateReservation(@RequestBody Reservation Reservation) {
        return ReservationService.saveReservation(Reservation);
    }
}
