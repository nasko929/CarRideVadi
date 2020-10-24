package com.vadi.vadi.modules.user.domain;


import com.vadi.vadi.common.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "USERS")
public class User extends BaseEntity {

    @Id
    @SequenceGenerator(name = "usersSequence", sequenceName = "users_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usersSequence")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String telephoneNumber;

    @NotNull
    private String email;
}
