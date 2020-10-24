package com.vadi.vadi.modules.userinformation.repository;

import com.vadi.vadi.modules.userinformation.domain.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInformationRepository extends JpaRepository<UserInformation, Long>,
        QuerydslPredicateExecutor<UserInformation> {
}
