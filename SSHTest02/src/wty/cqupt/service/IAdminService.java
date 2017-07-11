package wty.cqupt.service;

import wty.cqupt.entity.Admin;




//一定不能忘了注解！！（事务配置的最后一步）
//@Transactional
public interface IAdminService {
	
	
	//注册
	void register(Admin admin);
	
	//登录
	Admin login(Admin admin);
}
