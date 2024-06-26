package org.talent.talentpay.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class NewUserRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private LocalDate dob;
    private String nrc;
    private String phoneNumber;
    private String mail;
    private String address;
}
