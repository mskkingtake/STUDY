package mskkingtake.Dao;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.Emp;

public interface EmpMapper {
	/**
	 * 查询员工信息
	 * @param id
	 * @return
	 */
	public Emp getEmpById(@Param("ID") Integer id);
	
	/**
	 * 增加员工信息
	 * @param id
	 * @return
	 */
	public Integer addEmp(@Param("EMP") Emp emp);
	
	/**
	 * 修改员工信息
	 * @param id
	 * @return
	 */
	public Integer modEmp(@Param("EMP") Emp emp);
	
	/**
	 * 删除员工信息
	 * @param id
	 * @return
	 */
	public Integer delEmp(@Param("ID") Integer id);
}
