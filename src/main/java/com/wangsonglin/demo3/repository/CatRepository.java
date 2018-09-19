package com.wangsonglin.demo3.repository;

import com.wangsonglin.demo4.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository -- 是接口 ，不是class.
 * @author wsl
 * @version v.0.1
 */
public interface CatRepository extends CrudRepository<Cat, Integer>{

}
