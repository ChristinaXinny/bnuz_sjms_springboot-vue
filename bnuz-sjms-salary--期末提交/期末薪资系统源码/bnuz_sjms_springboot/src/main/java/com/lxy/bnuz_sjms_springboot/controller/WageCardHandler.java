package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.WageCard;
import com.lxy.bnuz_sjms_springboot.repository.WageCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-06-01 5:21 下午
 */

@RestController
@RequestMapping("/wageCard")
public class WageCardHandler {

    @Autowired
    private WageCardRepository wageCardRepository;

    @GetMapping("/findAll")
    public List<WageCard> findAll(){
        return wageCardRepository.findAll();
    }

}
