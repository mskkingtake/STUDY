package mskkingtake.main;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mskkingtake.Dao.MskTestMoreMapper;
import mskkingtake.bean.MskTest;
import mskkingtake.util.MyBatisConf;

public class MyBatisTestMore {

	public static void main(String[] args) {
		String id = "33";
		
		
		getMskTestbyId(id);
	}
	
	/**
	 * 简单MyBatis读取数据
	 */
	private static void getMskTestbyId(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			MskTestMoreMapper mskTestMoreMapper = sqlSession.getMapper(MskTestMoreMapper.class);
			
			MskTest mskTest = mskTestMoreMapper.getMskTestById(id);
			
			mskTest.show();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
