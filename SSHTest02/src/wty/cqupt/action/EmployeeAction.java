package wty.cqupt.action;

import java.util.List;
import java.util.Map;

import wty.cqupt.entity.Employee;
import wty.cqupt.service.DeptService;
import wty.cqupt.service.IEmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


/*
 * 员工列表展示
 */
public class EmployeeAction extends ActionSupport {
	//一、封装数据
	
	
	//二、注入员工Service
	private IEmployeeService employeeService;
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	//部门Service
	private DeptService deptService;
	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}
	
	
	public String list(){
		//查询所有员工
		List<Employee> listEmp = employeeService.getAll();
		//保存到request
		Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("listEmp", listEmp);
		return "list";
	}
	
	
}
 