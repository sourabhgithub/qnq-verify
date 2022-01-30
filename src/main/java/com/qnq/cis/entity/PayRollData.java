package com.qnq.cis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PayRollData")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayRollData {
    @Id
    @GeneratedValue
    private int id;
    private String employerName;
}
