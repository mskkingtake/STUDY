package mskkingtake.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.Emp;

public interface EmpDynamicMapper {
	
	/**
	 * 查询员工信息
	 * @param id
	 * @return
	 */
	public List<Emp> getEmpIf(@Param("EMP") Emp emp);
	
	/**
	 * 查询员工信息
	 * @param id
	 * @return
	 */
	public List<Emp> getEmpChoose(@Param("EMP") Emp emp);
	
	/**
	 * 修改员工信息
	 * @param id
	 * @return
	 */
	public Integer modEmpSet(@Param("EMP") Emp emp);
	
	/**
	 * 查询员工信息
	 * @param id
	 * @return
	 */
	public List<Emp> getEmpForeach(@Param("idList") List<Integer> idList);
	
	/**
	 * 批量插入员工信息
	 * @param id
	 * @return
	 */
	public Integer addEmpForeach(@Param("empList") List<Emp> empList);
}
