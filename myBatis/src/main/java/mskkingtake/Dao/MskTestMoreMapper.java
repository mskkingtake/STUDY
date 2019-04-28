package mskkingtake.Dao;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.MskTest;

public interface MskTestMoreMapper {
	/**
	 * 查询数据库信息---通过ID
	 * @param id
	 * @return
	 */
	public MskTest getMskTestById(@Param("id") String id);
}
