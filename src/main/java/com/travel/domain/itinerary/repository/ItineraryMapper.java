package com.travel.domain.itinerary.repository;

import com.travel.domain.itinerary.entity.ItineraryDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItineraryMapper {
    public List<ItineraryDTO> findAllItineraries(int tripId);

    public ItineraryDTO findItineraryById(int itineraryId);

    public int addItinerary(@Param("tripId") int tripId, @Param("itinerary") ItineraryDTO itinerary);

    public int editItinerary(@Param("itineraryId") int itineraryId, @Param("itinerary") ItineraryDTO itinerary);
}