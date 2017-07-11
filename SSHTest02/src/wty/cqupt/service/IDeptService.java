package wty.cqupt.service;

import java.util.List;

import wty.cqupt.entity.Dept;

//一定不能忘了注解！！（事务配置的最后一步）
//@Transactional
public interface IDeptService {

	// 查询全部
	List<Dept> getAll();

	// 根据主键查询

	Dept findById(int id);

}
