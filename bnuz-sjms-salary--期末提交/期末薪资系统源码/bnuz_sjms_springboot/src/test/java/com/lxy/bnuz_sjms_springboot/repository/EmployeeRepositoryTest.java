package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


/**
 * @author ChristinaXinny
 * @create 2021-05-31 3:54 pm
 */

@SpringBootTest
class EmployeeRepositoryTest {
/*
@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
    通过 @Autowired的使用来消除 set ，get方法。
    在使用@Autowired之前，我们对一个bean配置起属性时，是这用用的
    <property name="属性名" value=" 属性值"/>
 */
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void findAll(){
        //List list = employeeRepository.findAll();
        //list.forEach(System.out::println);
        System.out.println(employeeRepository.findAll());

    }

    @Test
    void delete(){
        int idd = 1;
        employeeRepository.deleteById(idd);
    }


    //@PostMapping("/findById/{id}")
    @Test
    public void findById(){
        int id =3;
        System.out.println("======"+id);
        Employee save = employeeRepository.findById(id).get();
        if (save!=null){
            System.out.println(save);
        }
        else{
            System.out.println("ddd");
        }
    }


    //@PostMapping("/delete/{id}")
    @Test
    public void dele(){
        int id= 1;
        employeeRepository.deleteById(id);
        if (employeeRepository.findById(id)!=null){
            System.out.println("ssss");
        }
        else {
            System.out.println("eeee");
        }
    }

}
