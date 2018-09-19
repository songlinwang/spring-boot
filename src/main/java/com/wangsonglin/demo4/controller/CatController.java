package com.wangsonglin.demo4.controller;

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
	
	@RequestMapping("/findByCatName")
	public com.wangsonglin.demo4.bean.Cat findByCatName(String catName){
		return catService.findByCatName(catName);
	}
	
	@RequestMapping("/findByCatName2")
	public com.wangsonglin.demo4.bean.Cat findByCatName2(String catName){
		System.out.println("CatController.findByCatName2()");
		return catService.findByCatName2(catName);
	
	}
	
	@RequestMapping("/selectByCatName")
	public com.wangsonglin.demo4.bean.Cat selectByCatName(String catName){
		return catService.selectByCatName(catName);
	}
}
