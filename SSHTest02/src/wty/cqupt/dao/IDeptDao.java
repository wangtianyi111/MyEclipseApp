package wty.cqupt.dao;

import java.util.List;

import wty.cqupt.entity.Dept;

/**
 * ����ģ��dao�ӿ����
 * 
 * @author Jie.Yuan
 * 
 */
public interface IDeptDao {

	/**
	 * ��ѯȫ��
	 * @return ����ȫ����Ϣ
	 */
	List<Dept> getAll();

	/**
	 * ��������ѯ
	 * @param id  ����
	 * @return ���ز�ѯ��Ľ��
	 */
	Dept findById(int id);

}
