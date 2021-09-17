package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.Employee;
import com.lxy.bnuz_sjms_springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-05-31 4:38 下午
 */

@RestController
@RequestMapping("/employee")
public class  EmployeeHandler {


    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/findAll")
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }



    //分页查询  这里是使用从前端传入数据的方式进行
    @GetMapping("/findAllFY/{page}/{size}")
    ///http://localhost:8080/myWageCard/findAllFY/{page}/{size}
    //从前端传回数据@PathVariable("page") Integer page,
    //把{page}数据采用Integer类型转换成page--第二个page是java的 第一个是前端的
    public Page<Employee> findAllFY(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        //Pageable 一个接口  PageRequest：实现了Pageable接口的实现类
        //PageRequest有一个方法of用来分页
        Pageable pageable = PageRequest.of(page-1, size);
        //employeeRepository有一个findALl方法 是用来分页的 需要传入pageable
        return employeeRepository.findAll(pageable);
    }


    //public String add(@RequestBody Employee employee){
    //    employeeRepository.
    //}



    @PostMapping("/save")
    public String save(@RequestBody Employee employee){
        Employee save = employeeRepository.save(employee);
        if (save != null){
            return "success";
        }
        else {

            return "error";
        }
    }



    @DeleteMapping("/delete/{id}")
    public boolean dele(@PathVariable("id") int id){
        if (employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

    @GetMapping("/findById/{id}")
    public List<Employee> findById(@PathVariable("id") int id){
        System.out.println("======"+id);
        List<Integer> list = new ArrayList<>();
        list.add(id);
        //Employee save = employeeRepository.findAllById(list);
        return employeeRepository.findAllById(list);
        //if (save!=null){
        //    return save;
        //}
        //else{
        //    return null;
        //}
    }




    @PostMapping("/get/{id}")
    public Employee getById(@PathVariable("id") int id){
        System.out.println("======"+id);
        Employee save = employeeRepository.getById(id);
        if (save!=null){
            return save;
        }
        else{
            return null;
        }
    }

    @PostMapping("/update")
    public String update(@RequestBody Employee em){
        Employee save = employeeRepository.save(em);
        if (em!=null){
            return "update success";
        }
        else{
            return "update error";
        }
    }

    //public String delete(@RequestBody int id){
    //    employeeRepository.deleteById(id);
    //
    //}




}
