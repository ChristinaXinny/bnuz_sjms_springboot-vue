package com.lxy.bnuz_sjms_springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author ChristinaXinny
 * @create 2021-06-02 9:07 上午
 */

@Entity
@Data
public class AffiliationCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emAffId;
    private Integer emId;
    private String emName;
    private Integer affId;
    private String affName;
    private Date time;
    private Integer count;



}
