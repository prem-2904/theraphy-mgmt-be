package com.prem.therapy_mgmt_be.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tblTherapists")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Therapists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private String therapistname;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String education;

    @Column(nullable = false)
    private String specialistareas;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(length = 500, nullable = false)
    private String aboutme;

    @Column(nullable = false, name = "profile_picture", length = 500)
    private String profilePicture;

    @Column(name="is_deleted",columnDefinition = "DEFAULT false")
    private Boolean isDeleted;

    @Column(nullable = false)
    private String typeoflogin;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    private LocalDateTime createdat;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP", insertable = false, updatable = false)
    private LocalDateTime updatedat;
}
