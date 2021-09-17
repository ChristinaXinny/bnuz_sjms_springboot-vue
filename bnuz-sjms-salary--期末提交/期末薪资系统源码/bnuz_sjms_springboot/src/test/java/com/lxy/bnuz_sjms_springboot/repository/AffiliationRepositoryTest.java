package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.Affiliation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ChristinaXinny
 * @create 2021-06-01 9:46 下午
 */
@SpringBootTest
class AffiliationRepositoryTest {

    @Autowired
    private AffiliationRepository affiliationRepository;

    @Test
    void findAll(){
        System.out.println(affiliationRepository.findAll());
    }


    @Test
    void save(){
        Affiliation aff = new Affiliation();
        aff.setName("www");
        //aff.setLevel(2);
        aff.setExpenses(222);
        aff.setStar(2.2);
        aff.setDescribee("dssd");
        aff.setImage("wew");
        Affiliation save = affiliationRepository.save(aff);
        System.out.println(save);
    }
}
