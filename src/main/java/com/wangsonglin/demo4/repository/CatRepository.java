package com.wangsonglin.demo4.repository;

import org.springframework.data.repository.CrudRepository;

/**
 * Repository -- 是接口 ，不是class.
 * @author wsl
 * @version v.0.1
 */
public interface CatRepository extends CrudRepository<com.wangsonglin.demo4.bean.Cat, Integer>{

}
