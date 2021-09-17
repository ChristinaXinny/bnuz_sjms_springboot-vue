package com.lxy.bnuz_sjms_springboot.entity;

import javafx.stage.Stage;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ChristinaXinny
 * @create 2021-06-01 9:15 下午
 */

@Entity
@Data
public class Affiliation {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int affId;
    private String name;
    private double expenses;
    private double star;
    private String describee;
    private String image;
    private String wheree;
    private String how;
    private String resource;


}
