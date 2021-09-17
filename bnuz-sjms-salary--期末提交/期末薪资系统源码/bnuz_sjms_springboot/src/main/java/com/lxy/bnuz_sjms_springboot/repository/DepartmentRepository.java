package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ChristinaXinny
 * @create 2021-06-02 7:30 上午
 */

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
