package com.lxy.bnuz_sjms_springboot.controller;

import com.lxy.bnuz_sjms_springboot.entity.Department;
import com.lxy.bnuz_sjms_springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChristinaXinny
 * @create 2021-06-02 7:31 上午
 */

@RestController
@RequestMapping("/department")
public class DepartmentHandler {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/findAll")
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

}
