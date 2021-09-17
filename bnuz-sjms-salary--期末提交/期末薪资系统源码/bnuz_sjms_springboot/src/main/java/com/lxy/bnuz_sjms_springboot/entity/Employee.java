package com.lxy.bnuz_sjms_springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ChristinaXinny
 * @create 2021-05-31 3:46 下午
 */

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String name;
    private String sex;
    private Integer age;
    private String address;
    private String bankCard;
    private String department;
    private String wageCard;







}
