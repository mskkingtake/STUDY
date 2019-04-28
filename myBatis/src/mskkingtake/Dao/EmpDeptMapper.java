package mskkingtake.Dao;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.EmpAndDept;
import mskkingtake.bean.EmpDept;

public interface EmpDeptMapper {
	
	/**
	 * ��ѯԱ��������Ϣ
	 * @param id
	 * @return
	 */
	public EmpAndDept getEmpAndDeptById(@Param("ID") Integer id);
	
	/**
	 * ��ѯԱ��������Ϣ
	 * association������ѯ
	 * @param id
	 * @return
	 */
	public EmpDept getEmpDeptById(@Param("ID") Integer id);
	
	/**
	 * ��ѯԱ��������Ϣ
	 * association������ѯ
	 * �ӳټ���
	 * @param id
	 * @return
	 */
	public EmpDept getEmpDeptByIdStep(@Param("ID") Integer id);
	
}
