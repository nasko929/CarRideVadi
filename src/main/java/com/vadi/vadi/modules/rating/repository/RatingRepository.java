package com.vadi.vadi.modules.rating.repository;

import com.vadi.vadi.modules.rating.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>, QuerydslPredicateExecutor<Rating> {

}
