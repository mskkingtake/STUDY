package mskkingtake.main;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mskkingtake.bean.MskTest;
import mskkingtake.util.MyBatisConf;

public class MyBatisTest {

	public static void main(String[] args) {
		myBatisTest();
	}
	
	/**
	 * 简单MyBatis读取数据
	 */
	private static void myBatisTest() {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			MskTest mskTest = sqlSession.selectOne("mskkingtake.Dao.MskTestMapper.getMskTestById", "001");
			mskTest.show();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
