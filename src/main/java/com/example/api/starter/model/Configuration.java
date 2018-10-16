package com.example.api.starter.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "configuration")
@EqualsAndHashCode(callSuper = false)
public class Configuration extends BaseEntity {

    @Column(length = 100, nullable = false, unique = true)
    private String key;

    @Column(length = 200, nullable = false)
    private String value;

}
