package mskkingtake.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.Emp;

public interface EmpDynamicMapper {
	
	/**
	 * ��ѯԱ����Ϣ
	 * @param id
	 * @return
	 */
	public List<Emp> getEmpIf(@Param("EMP") Emp emp);
	
	/**
	 * ��ѯԱ����Ϣ
	 * @param id
	 * @return
	 */
	public List<Emp> getEmpChoose(@Param("EMP") Emp emp);
	
	/**
	 * �޸�Ա����Ϣ
	 * @param id
	 * @return
	 */
	public Integer modEmpSet(@Param("EMP") Emp emp);
	
	/**
	 * ��ѯԱ����Ϣ
	 * @param id
	 * @return
	 */
	public List<Emp> getEmpForeach(@Param("idList") List<Integer> idList);
	
	/**
	 * ��������Ա����Ϣ
	 * @param id
	 * @return
	 */
	public Integer addEmpForeach(@Param("empList") List<Emp> empList);
}
