package wty.cqupt.service;

import java.util.List;

import wty.cqupt.dao.IDeptDao;
import wty.cqupt.entity.Dept;

public class DeptService implements IDeptService {

	private IDeptDao deptDao;
	
	
	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return deptDao.getAll();
	}

	@Override
	public Dept findById(int id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

}
