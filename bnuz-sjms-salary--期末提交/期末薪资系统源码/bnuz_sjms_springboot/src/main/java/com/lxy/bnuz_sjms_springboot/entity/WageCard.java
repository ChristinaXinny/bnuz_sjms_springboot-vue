package com.lxy.bnuz_sjms_springboot.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author ChristinaXinny
 * @create 2021-06-01 5:16 下午
 */

@Entity
@Data
public class WageCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slipId;
    private int cardId;
    private double grossPay;
    private double cutPay;
    private double realPay;
    private Date periodStart;
    private Date periodEnd;


}
