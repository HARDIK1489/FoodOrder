package com.amdocs.Food.order.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "userProfile")
@Getter
@Setter
public class UserProfile{

    @Id
    @Column(
            name = "userId"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer userId;

    @Column(
            name = "name",
            columnDefinition = "VARCHAR(11)"
    )
    private String name;

    @Column(
            name = "contactNumber",
            columnDefinition = "BIGINT(11)"
    )
    private Long contactNumber;

    @Column(
            name = "address",
            columnDefinition = "VARCHAR(11)"
    )
    private String address;

}
