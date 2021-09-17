package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.Receipt;
import com.lxy.bnuz_sjms_springboot.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-06-03 12:15 下午
 */


@RestController
@RequestMapping("/receipt")
public class ReceiptHandler {

    @Autowired
    private ReceiptRepository receiptRepository;

    @GetMapping("/findAll")
    public List<Receipt> findAll(){
        return receiptRepository.findAll();
    }
}
