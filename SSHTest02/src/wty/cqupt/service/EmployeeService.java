package wty.cqupt.service;

import java.util.List;

import wty.cqupt.dao.IEmployeeDao;
import wty.cqupt.entity.Employee;

public class EmployeeService implements IEmployeeService {
	
	private IEmployeeDao employeeDao;
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.save(emp);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeDao.delete(id);
	}

	@Override
	public void delete(int[] ids) {
		// TODO Auto-generated method stub
		if (ids != null && ids.length > 0) {
			for(int id : ids){
				delete(id);
			}
		}
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.update(emp);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> getAll(String employeeName) {
		// TODO Auto-generated method stub
		return employeeDao.getAll(employeeName);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeDao.getAll();
	}

}
