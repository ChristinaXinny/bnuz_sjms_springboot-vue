package com.lxy.bnuz_sjms_springboot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ChristinaXinny
 * @create 2021-06-01 5:25 下午
 */

@SpringBootTest
class WageCardRepositoryTest {

    @Autowired
    private WageCardRepository wageCardRepository;

    @Test
    void findAll(){
        System.out.println(wageCardRepository.findAll());
    }


}
