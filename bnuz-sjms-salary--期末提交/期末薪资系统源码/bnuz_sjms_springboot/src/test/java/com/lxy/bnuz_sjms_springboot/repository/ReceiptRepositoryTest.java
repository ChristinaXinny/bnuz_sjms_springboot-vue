package com.lxy.bnuz_sjms_springboot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ChristinaXinny
 * @create 2021-06-03 12:19 下午
 */

@SpringBootTest
class ReceiptRepositoryTest {
    @Autowired
    private ReceiptRepository receiptRepository;

    @Test
    void findAll(){
        System.out.println(receiptRepository.findAll());
    }

}
