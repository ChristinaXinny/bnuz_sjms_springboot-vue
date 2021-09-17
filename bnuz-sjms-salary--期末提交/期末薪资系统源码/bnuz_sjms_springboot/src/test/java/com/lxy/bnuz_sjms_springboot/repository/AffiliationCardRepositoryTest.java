package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.AffiliationCard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ChristinaXinny
 * @create 2021-06-02 9:14 上午
 */
@SpringBootTest
class AffiliationCardRepositoryTest {

    @Autowired
    private AffiliationCardRepository affiliationCardRepository;

    @Test
    void findAll(){
        System.out.println(affiliationCardRepository.findAll());
    }

}
