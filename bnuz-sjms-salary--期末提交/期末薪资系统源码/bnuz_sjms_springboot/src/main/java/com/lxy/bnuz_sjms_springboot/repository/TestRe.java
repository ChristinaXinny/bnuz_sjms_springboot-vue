package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ChristinaXinny
 * @create 2021-06-04 10:09 下午
 */
public interface TestRe extends JpaRepository<Test, Integer> {
}
