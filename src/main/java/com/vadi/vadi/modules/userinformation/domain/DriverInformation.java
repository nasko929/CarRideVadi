package com.vadi.vadi.modules.userinformation.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverInformation {

    private String driverLicenseNumber;

    private String carBrand;

    private String carNumber;

    private String iban;
}
