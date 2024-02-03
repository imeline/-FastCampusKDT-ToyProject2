package com.travel.domain.itinerary.service;

import com.travel.domain.itinerary.entity.ItineraryDTO;
import com.travel.domain.itinerary.repository.ItineraryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ItineraryService {
    @Autowired
    private ItineraryMapper mapper;

    public List<ItineraryDTO> findAllItineraries(int tripId) {
        return mapper.findAllItineraries(tripId);
    }

    public ItineraryDTO findItineraryById(int itineraryId) {
        return mapper.findItineraryById(itineraryId);
    }

    public int addItinerary(int tripId, ItineraryDTO itinerary) {
        return mapper.addItinerary(tripId, itinerary);
    }

    public int editItinerary(int itineraryId, ItineraryDTO itinerary) {
        return mapper.editItinerary(itineraryId, itinerary);
    }
}