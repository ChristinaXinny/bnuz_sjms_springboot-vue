package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChristinaXinny
 * @create 2021-05-31 3:52 下午
 */

/*

 */


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
