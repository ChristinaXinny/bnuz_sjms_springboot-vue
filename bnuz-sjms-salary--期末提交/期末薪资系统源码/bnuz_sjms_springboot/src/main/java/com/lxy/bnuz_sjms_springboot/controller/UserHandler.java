package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.User;
import com.lxy.bnuz_sjms_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.xml.crypto.URIReference;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-06-04 10:33 上午
 */

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }


    //@GetMapping("/getById/{id}")
    //public String getById(@PathVariable int id){
    //    User us = userRepository.findById(id).getPassword();
    //    return us.getPassword();
    //}





    @PostMapping("/save")
    public String save(@RequestBody User user){
        User save = userRepository.save(user);
        if (save != null){
            return "success";
        }
        else {
            return "error";
        }
    }


    @PostMapping("/update")
    public boolean update(@RequestBody User user){
        User save = userRepository.save(user);
        if (save!=null){
            return true;
        }
        else{
            return false;
        }
    }


}
