package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.Test;
import com.lxy.bnuz_sjms_springboot.repository.TestRe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChristinaXinny
 * @create 2021-06-04 10:10 下午
 */
@RestController
@RequestMapping("/test")
public class TestHa {

    @Autowired
    private TestRe testRe;

    @PostMapping("/posave")
    public String po(@RequestBody Test test){
        Test save = testRe.save(test);
        if (save!=null){
            return "ss";
        }
        else {
            return "ee";
        }

    }
}
