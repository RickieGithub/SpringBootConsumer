package com.springboot.learn.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn.service.ComputeService;

/**  

 * @Title: TestController.java

 * @Prject: consumer

 * @Package: com.springboot.learn.web

 * @Description: TODO

 * @author: ping.wen  

 * @date: 2017年7月12日 下午2:58:13

 */
@RestController
public class TestController {
	@Autowired
	private ComputeService computeService;

	@RequestMapping("/hello/{a}/{b}")
	public String index(@PathVariable("a") Integer a ,@PathVariable("b") Integer b ){
		return computeService.add(a, b).toString();
	}
	
	@RequestMapping("/test")
	public String index(){
		return "ok";
	}
}
