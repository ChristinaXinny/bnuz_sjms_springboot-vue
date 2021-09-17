package com.lxy.bnuz_sjms_springboot.repository;

import com.lxy.bnuz_sjms_springboot.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ChristinaXinny
 * @create 2021-06-03 12:14 下午
 */


public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {
}
