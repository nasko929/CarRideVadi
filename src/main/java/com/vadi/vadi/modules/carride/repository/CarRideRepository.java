package com.vadi.vadi.modules.carride.repository;

import com.vadi.vadi.modules.carride.domain.CarRide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRideRepository extends JpaRepository<CarRide, Long>, QuerydslPredicateExecutor<CarRide> {

}
