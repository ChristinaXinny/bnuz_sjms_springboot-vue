package com.lxy.bnuz_sjms_springboot.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author ChristinaXinny
 * @create 2021-06-03 12:11 下午
 */

@Entity
@Data
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receiptId;
    private Date date;
    private String abstracts;
    private String subjects;
    private String project;
    private double money;
    private String director;


}
