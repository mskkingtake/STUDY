package mskkingtake.Dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.MskTest;

public interface MskTestMapper {
	/**
	 * ��ѯ���ݿ���Ϣ---ͨ��ID
	 * @param id
	 * @return
	 */
	public MskTest getMskTestById(@Param("id") String id);
	
	/**
	 * ��ѯ���ݿ���Ϣ---ͨ��ID
	 * @param id
	 * @return
	 */
	public List<MskTest> getMskTestList(@Param("id") String id);
	
	/**
	 * ��ѯ���ݿ���Ϣ---ͨ��ID
	 * @param id
	 * @return
	 */
	public Map<String, String> getMskTestByIdMap(@Param("id") String id);
	
	/**
	 * ��ѯ���ݿ���Ϣ---ͨ��ID
	 * @param id
	 * @return
	 */
	@MapKey("id")
	public Map<String, Object> getMskTestListMap(@Param("name") String name);
	
	/**
	 * �������ݿ���Ϣ
	 * @param mskTest
	 */
	public void addMskTest(MskTest mskTest);
	
	/**
	 * �������ݿ���Ϣ
	 * @param mskTest
	 */
	public void updateMskTest(MskTest mskTest);
	
	/**
	 * ɾ�����ݿ���Ϣ
	 * @param mskTest
	 */
	public void deleteMskTest(MskTest mskTest);
}
