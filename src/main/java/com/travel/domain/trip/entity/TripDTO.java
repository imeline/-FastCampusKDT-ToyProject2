package com.travel.domain.trip.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import com.travel.domain.itinerary.entity.ItineraryDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TripDTO {
    private Integer tripId; // 여행 id
    private String tripName; // 여행 이름
    private String tripDepartureDate; // 출발 시간
    private String tripArrivalDate; // 도착 시간
    private String tripDestination;
    private boolean isDomestic; // 국내외 체크
}
