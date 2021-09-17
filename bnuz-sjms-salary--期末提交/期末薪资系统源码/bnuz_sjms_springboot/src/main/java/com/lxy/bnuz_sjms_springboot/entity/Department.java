package com.lxy.bnuz_sjms_springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ChristinaXinny
 * @create 2021-06-02 7:27 上午
 */

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int depId;
    private String name;
    private int population;
    private String classification;
    private String schedule;
    private String national;
    private String area;
    private String city;



}
