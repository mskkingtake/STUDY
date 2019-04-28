package mskkingtake.Dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.MskTest;

public interface MskTestMapper {
	/**
	 * 查询数据库信息---通过ID
	 * @param id
	 * @return
	 */
	public MskTest getMskTestById(@Param("id") String id);
	
	/**
	 * 查询数据库信息---通过ID
	 * @param id
	 * @return
	 */
	public List<MskTest> getMskTestList(@Param("id") String id);
	
	/**
	 * 查询数据库信息---通过ID
	 * @param id
	 * @return
	 */
	public Map<String, String> getMskTestByIdMap(@Param("id") String id);
	
	/**
	 * 查询数据库信息---通过ID
	 * @param id
	 * @return
	 */
	@MapKey("id")
	public Map<String, Object> getMskTestListMap(@Param("name") String name);
	
	/**
	 * 插入数据库信息
	 * @param mskTest
	 */
	public void addMskTest(MskTest mskTest);
	
	/**
	 * 更新数据库信息
	 * @param mskTest
	 */
	public void updateMskTest(MskTest mskTest);
	
	/**
	 * 删除数据库信息
	 * @param mskTest
	 */
	public void deleteMskTest(MskTest mskTest);
}
