package com.joing.mybatisplus;

import com.joing.mybatisplus.service.ProductService;
import com.joing.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Join.Yao (pathinfuture@163.com)
 * @date 2022/05/25 17:32
 */
@SpringBootTest
class MybatisPlusDatasourceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;

	@Test
	public void test(){
		System.out.println(userService.getById(1));
		System.out.println(productService.getById(1));
	}

}
