package mskkingtake.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.DeptpartmentAndEmp;
import mskkingtake.bean.EmpAndDept;

public interface DeptpartmentMapper {
	
	/**
	 * ��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public EmpAndDept getDeptById(@Param("ID") Integer id);
	
	/**
	 * ��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public List<DeptpartmentAndEmp> getDeptAndEmpById(@Param("ID") String id);
}
