package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
@Data
@NoArgsConstructor
public class Region extends BaseEntity {

    //private int region_id;
    private String country;
    private String region;

    @OneToOne(mappedBy = "region")
    private Employee employee;

    public Region(String country, String region) {
        this.country = country;
        this.region = region;
    }
}
