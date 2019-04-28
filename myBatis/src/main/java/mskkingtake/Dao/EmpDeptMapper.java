package mskkingtake.Dao;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.EmpAndDept;
import mskkingtake.bean.EmpDept;

public interface EmpDeptMapper {
	
	/**
	 * 查询员工部门信息
	 * @param id
	 * @return
	 */
	public EmpAndDept getEmpAndDeptById(@Param("ID") Integer id);
	
	/**
	 * 查询员工部门信息
	 * association级联查询
	 * @param id
	 * @return
	 */
	public EmpDept getEmpDeptById(@Param("ID") Integer id);
	
	/**
	 * 查询员工部门信息
	 * association级联查询
	 * 延迟加载
	 * @param id
	 * @return
	 */
	public EmpDept getEmpDeptByIdStep(@Param("ID") Integer id);
	
}
