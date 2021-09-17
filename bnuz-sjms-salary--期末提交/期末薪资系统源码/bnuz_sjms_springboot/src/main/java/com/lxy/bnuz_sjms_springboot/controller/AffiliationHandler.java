package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.Affiliation;
import com.lxy.bnuz_sjms_springboot.entity.User;
import com.lxy.bnuz_sjms_springboot.repository.AffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-06-01 9:18 下午
 */

/**
 * 这是一个用来写各种sql的语句的类
 * 其中声明了一个继承自JpaRepository的接口
 * JpaRepository类里面有许多写好类的sql语句
 * 这里是为了把接口内部的方法 调用变成自己的
 */



//@RestController
// = @Controller [该类所在的项目跑起来的过程中，这个类就被实例化 代表该类是充当Controller的作用]
// + @ResponseBody [指该类中所有的API接口返回的数据，甭管你对应的方法返回Map或是其他Object，它会以Json字符串的形式返回给客户端，]

@RestController
@RequestMapping("/affiliation")
public class AffiliationHandler {


    @Autowired
    private AffiliationRepository affiliationRepository;


    //到这里的网址是localhost:8181/affiliation/findAll
    @GetMapping("/findAll")
    public List<Affiliation> findAll(){

        return affiliationRepository.findAll();
    }


    //@PostMapping("/sssave")
    //public String savee(@RequestBody Affiliation affiliation){
    //    Affiliation save = affiliationRepository.save(affiliation);
    //    if (save!=null){
    //        return "success";
    //    }
    //    else {
    //        return "error";
    //    }
    //}


    //@PostMapping("/ssave")
    //public String save(@RequestBody Affiliation affiliation){
    //    Affiliation save = affiliationRepository.save(affiliation);
    //    if (save != null){
    //        return "success";
    //    }
    //    else {
    //        return "error";
    //    }
    //}

    @PostMapping("/save")
    public String save(@RequestBody Affiliation aff){
        Affiliation save = affiliationRepository.save(aff);
        if (save != null){
            return "success";
        }
        else {
            return "error";
        }

    }


}
