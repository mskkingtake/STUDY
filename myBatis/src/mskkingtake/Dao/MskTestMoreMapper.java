package mskkingtake.Dao;

import org.apache.ibatis.annotations.Param;

import mskkingtake.bean.MskTest;

public interface MskTestMoreMapper {
	/**
	 * ��ѯ���ݿ���Ϣ---ͨ��ID
	 * @param id
	 * @return
	 */
	public MskTest getMskTestById(@Param("id") String id);
}
