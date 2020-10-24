package com.vadi.vadi.modules.rating.domain;

import com.vadi.vadi.common.domain.BaseEntity;
import com.vadi.vadi.modules.user.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "RATING")
public class Rating extends BaseEntity {

    @Id
    @SequenceGenerator(name = "ratingSequence", sequenceName = "rating_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ratingSequence")
    private Long id;

    @OneToOne
    @JoinColumn(name = "RATING_USER_ID", referencedColumnName = "ID", nullable = false)
    @NotNull
    public User ratingUser;

    @OneToOne
    @JoinColumn(name = "RATED_USER_ID", referencedColumnName = "ID", nullable = false)
    @NotNull
    public User ratedUser;

    @NotNull
    public Double rating;

    @Lob
    @NotNull
    public String message;
}
