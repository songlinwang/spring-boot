package com.wangsonglin.demo3.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * 使用@Repository注解，标注这是一个持久化操作对象.
 * @author wsl
 * @version v.0.1
 */
@Repository
public class CatDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public com.wangsonglin.demo4.bean.Cat selectByCatName(String catName){
		
		/**
		 * 1、定义一个Sql语句；
		 * 2、定义一个RowMapper.
		 * 3、执行查询方法.
		 */
		String sql = "select *from cat where cat_name=?";
		RowMapper<com.wangsonglin.demo4.bean.Cat> rowMapper = new BeanPropertyRowMapper<>(com.wangsonglin.demo4.bean.Cat.class);
		com.wangsonglin.demo4.bean.Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
		
		return cat;
	}
	
}
