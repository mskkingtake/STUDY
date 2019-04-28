package mskkingtake.Dao;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.Emp;

public interface EmpMapper {
	/**
	 * ��ѯԱ����Ϣ
	 * @param id
	 * @return
	 */
	public Emp getEmpById(@Param("ID") Integer id);
	
	/**
	 * ����Ա����Ϣ
	 * @param id
	 * @return
	 */
	public Integer addEmp(@Param("EMP") Emp emp);
	
	/**
	 * �޸�Ա����Ϣ
	 * @param id
	 * @return
	 */
	public Integer modEmp(@Param("EMP") Emp emp);
	
	/**
	 * ɾ��Ա����Ϣ
	 * @param id
	 * @return
	 */
	public Integer delEmp(@Param("ID") Integer id);
}
