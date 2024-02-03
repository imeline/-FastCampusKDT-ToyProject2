package com.travel.domain.trip.controller;

import com.travel.domain.trip.entity.TripDTO;
import com.travel.domain.trip.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/trips")
public class TripRestController {

    @Autowired
    private TripService tripService;
    @GetMapping("") // GET 전체보기 - trips
    public List<TripDTO> getTrips(){
        List<TripDTO> trips = tripService.getTripList();
        return trips;
    }

    @GetMapping("/{tripId}") // GET 상세보기 - trip
    public TripDTO getTripId(@PathVariable int tripId){
        TripDTO tripdto = tripService.getByTripId(tripId);
        return tripdto;
    }
    @PostMapping("")
    public List<TripDTO> createTrip(@RequestBody TripDTO tripdto){
        tripService.insertTrip(tripdto);
        return tripService.getTripList();
    }
    @PutMapping("/{tripId}")
    public TripDTO putTrip(@PathVariable int tripId, @RequestBody TripDTO tripdto) {
        tripService.updateTrip(tripId, tripdto);
        return tripService.getByTripId(tripId);
    }
}
