package wty.cqupt.service;

import wty.cqupt.dao.IAdminDao;
import wty.cqupt.entity.Admin;

public class AdminService implements IAdminService {
	
	private IAdminDao adminDao;//因为使用了接口，所以这里是JDK代理，一定要用接口接收
	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}
	@Override
	public void register(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.save(admin);
	}
	@Override
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.findByAdmin(admin);
	}

}
