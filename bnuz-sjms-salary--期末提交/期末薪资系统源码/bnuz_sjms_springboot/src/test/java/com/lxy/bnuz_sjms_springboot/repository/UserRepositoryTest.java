package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Id;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ChristinaXinny
 * @create 2021-06-04 10:30 上午
 */

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindAll(){
        System.out.println(userRepository.findAll());

    }


    //曾遇到错误 见tip_lxy 【错误1】
    @Test
    void testGetById(){
        int id = 1;
        //String idd = "111";
        //user
        User byId = userRepository.getById(id);
        //byId.get
        //String ss = byId.toString();
        //System.out.println(ss);
        //System.out.println(byId.getPassword());

        System.out.println(userRepository.getById(id));
    }

}
