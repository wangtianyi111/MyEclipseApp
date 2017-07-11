package wty.cqupt.dao;

import java.util.List;

import wty.cqupt.entity.Employee;

/**
 * Ա��ģ��dao�ӿ����
 * 
 * @author Jie.Yuan
 * 
 */
public interface IEmployeeDao {

	/**
	 * ����Ա��
	 * @param emp
	 */
	void save(Employee emp);

	/**
	 * ����Ա����Ϣ
	 * @param emp
	 */
	void update(Employee emp);

	/**
	 * �������ɾ��
	 * @param id
	 */
	void delete(int id);

	/**
	 * ��������ѯ
	 * @param id
	 * @return
	 */
	Employee findById(int id);

	/**
	 * ��ѯȫ��
	 * @return
	 */
	List<Employee> getAll();

	/**
	 * ���Ա�����������ѯ
	 * @param employeeName
	 * @return
	 */
	List<Employee> getAll(String employeeName);

}
