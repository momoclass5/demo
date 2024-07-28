package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.TestMapper;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TestMapper tm;

	@Test
	void contextLoads() {
		
		System.out.println("===============");
		String str = tm.selectDate();
		System.out.println(tm.selectDate());
	}

}
