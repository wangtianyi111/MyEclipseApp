package wty.cqupt.service;

import java.util.List;

import wty.cqupt.entity.Employee;

//一定不能忘了注解！！（事务配置的最后一步）
//@Transactional
public interface IEmployeeService {

	void save(Employee emp);

	void delete(int id);
	
	//删除多个
	void delete(int[] ids);

	void update(Employee emp);

	Employee findById(int id);

	List<Employee> getAll(String employeeName);

	List<Employee> getAll();
}
