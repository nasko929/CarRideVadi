package com.vadi.vadi.common.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
@DynamicUpdate
@Getter
@Setter
public class BaseEntity {

    @NotNull
    @Version
    @Column(name = "VERSION")
    private Integer version;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_CREATED", nullable = false, updatable = false)
    @CreationTimestamp
    private Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATED")
    @UpdateTimestamp
    private Date dateUpdated;

}
