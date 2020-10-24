package com.vadi.vadi.modules.userinformation.domain;

import com.vadi.vadi.common.domain.BaseEntity;
import com.vadi.vadi.modules.user.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "USER_INFORMATION")
public class UserInformation extends BaseEntity {

    @Id
    @SequenceGenerator(name = "userInformationSequence", sequenceName = "user_information_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userInformationSequence")
    private Long id;

    @OneToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID", nullable = false)
    @NotNull
    public User user;

    @Enumerated(EnumType.STRING)
    public UserType userType;

    @Lob
    public String data;
}
