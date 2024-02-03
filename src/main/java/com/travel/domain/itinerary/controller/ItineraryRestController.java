package com.travel.domain.itinerary.controller;

import com.travel.domain.itinerary.entity.ItineraryDTO;
import com.travel.domain.itinerary.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itineraries")
public class ItineraryRestController {
    @Autowired
    private ItineraryService service;

    @GetMapping("/trip/{tripId}") // 특정 여행에 해당하는 여정 전체 조회
    public List<ItineraryDTO> findAllItineraries(
            @PathVariable int tripId
    ) {
        List<ItineraryDTO> list = service.findAllItineraries(tripId);

        return list;
    }

    @GetMapping("/itinerary/{itineraryId}") // 여정 id로 여정 조회
    public ItineraryDTO findItineraryById(
            @PathVariable int itineraryId
    ) {
        ItineraryDTO itinerary = service.findItineraryById(itineraryId);

        return itinerary;
    }

    @PostMapping("/trip/{tripId}") // 특정 여행에 여정 등록
    public int addItinerary(
            @PathVariable int tripId,
            @RequestBody ItineraryDTO itinerary
    ) {
        int cnt = service.addItinerary(tripId, itinerary);

        return cnt;
    }

    @PutMapping("/itinerary/{itineraryId}") // 여정 수정
    public int editItinerary(
            @PathVariable int itineraryId,
            @RequestBody ItineraryDTO itinerary
    ) {
        int cnt = service.editItinerary(itineraryId, itinerary);

        return cnt;
    }
}