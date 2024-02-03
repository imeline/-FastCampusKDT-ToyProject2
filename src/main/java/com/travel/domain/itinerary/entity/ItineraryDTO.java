package com.travel.domain.itinerary.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItineraryDTO {
    private Integer itineraryId;
    private Integer tripId;
    private String itineraryType;
    private String itineraryName;
    private String departurePlace;
    private String destinationPlace;
    private String departureDatetime;
    private String arrivalDatetime;
    private String checkIn;
    private String checkOut;
}