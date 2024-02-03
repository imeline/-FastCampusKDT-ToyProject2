package com.travel.domain.trip.repository;


import com.travel.domain.trip.entity.TripDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface TripMapper {
    public List<TripDTO> getTripList();
    public TripDTO getByTripId(int tripId);
    public int updateTrip(@Param("tripId") int tripId, @Param("trip") TripDTO tripdto);
    public int insertTrip(TripDTO tripdto);
}
