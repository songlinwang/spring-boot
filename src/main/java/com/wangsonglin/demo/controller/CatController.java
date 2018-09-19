package com.wangsonglin.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cat")
public class CatController {
	
	@Resource
	private com.wangsonglin.demo3.service.CatService catService;
	
	@RequestMapping("/save")
	public String save(){
		com.wangsonglin.demo4.bean.Cat cat = new com.wangsonglin.demo4.bean.Cat();
		cat.setCatName("jack");
		cat.setCatAge(3);
		catService.save(cat);
		return "save ok.";
	}
	
	@RequestMapping("/delete")
	public String delete(){
		catService.delete(1);
		return "delete ok";
	}
	
	@RequestMapping("/getAll")
	public Iterable<com.wangsonglin.demo4.bean.Cat> getAll(){
		return catService.getAll();
	}
	
}
