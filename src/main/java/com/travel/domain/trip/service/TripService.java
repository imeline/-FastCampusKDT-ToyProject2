package com.travel.domain.trip.service;

import com.travel.domain.trip.entity.TripDTO;
import com.travel.domain.trip.repository.TripMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripMapper mapper;
    public List<TripDTO> getTripList() {
        return mapper.getTripList();
    }
    public TripDTO getByTripId(int tripId) {
        return mapper.getByTripId(tripId);
    }
    public int insertTrip(TripDTO tripdto) {
        return mapper.insertTrip(tripdto);
    }
    public int updateTrip(int tripId, TripDTO tripdto) {
        return mapper.updateTrip(tripId, tripdto);
    }
}
