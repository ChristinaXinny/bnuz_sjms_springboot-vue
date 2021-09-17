package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.AffiliationCard;
import com.lxy.bnuz_sjms_springboot.repository.AffiliationCardRepository;
import com.lxy.bnuz_sjms_springboot.repository.AffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-06-02 9:10 上午
 */

@RestController
@RequestMapping("/affiliationCard")
public class AffiliationCardHandler {

    @Autowired
    private AffiliationCardRepository affiliationCardRepository;


    @GetMapping("findAll")
    public List<AffiliationCard>findAll(){
        return affiliationCardRepository.findAll();
    }

}
