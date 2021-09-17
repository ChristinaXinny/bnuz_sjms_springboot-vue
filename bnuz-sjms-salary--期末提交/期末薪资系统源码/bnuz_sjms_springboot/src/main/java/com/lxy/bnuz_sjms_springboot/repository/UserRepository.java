package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ChristinaXinny
 * @create 2021-06-04 10:25 上午
 */


public interface UserRepository extends JpaRepository<User,Integer> {
}
