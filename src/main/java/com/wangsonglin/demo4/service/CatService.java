package com.wangsonglin.demo4.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wangsonglin.demo3.dao.CatDao;
import com.wangsonglin.demo4.repository.Cat2Repository;

@Service
public class CatService {
	
	@Resource
	private com.wangsonglin.demo3.repository.CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	@Resource
	private CatDao catDao;
	
	
	/**
	 * save,update ,delete 方法需要绑定事务.
	 * 
	 * 使用@Transactional进行事务的绑定.
	 * 
	 * @param cat
	 */
	
	//保存数据.
	@Transactional
	public void save(com.wangsonglin.demo4.bean.Cat cat){
		catRepository.save(cat);
	}
	
	//删除数据》
	@Transactional
	public void delete(int id){
		catRepository.delete(id);
	}
	
	//查询数据.
	public Iterable<com.wangsonglin.demo4.bean.Cat> getAll(){
		return catRepository.findAll();
	}
	
	
	public com.wangsonglin.demo4.bean.Cat findByCatName(String catName){
		return cat2Repository.findByCatName(catName);
	}
	
	
	public com.wangsonglin.demo4.bean.Cat findByCatName2(String catName){
		return cat2Repository.findMyCatName(catName);
	}
	
	
	public com.wangsonglin.demo4.bean.Cat selectByCatName(String catName){
		return catDao.selectByCatName(catName);
	}
}
