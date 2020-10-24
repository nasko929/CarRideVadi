package com.vadi.vadi.modules.carride.domain;

import com.vadi.vadi.common.domain.BaseEntity;
import com.vadi.vadi.modules.user.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "CAR_RIDES")
public class CarRide extends BaseEntity {

    @Id
    @SequenceGenerator(name = "carRidesSequence", sequenceName = "car_rides_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carRidesSequence")
    private Long id;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID", nullable = false)
    @NotNull
    public User user;

    @NotNull
    public Long availableSeats;

    @NotNull
    public Long maximumSeats;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    public Date takeOffDate;

    @NotNull
    public String cityFrom;

    @NotNull
    public String cityTo;

    @NotNull
    public Double price;
}
