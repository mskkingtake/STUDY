package mskkingtake.main;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mskkingtake.Dao.MskTestMapper;
import mskkingtake.bean.MskTest;
import mskkingtake.util.MyBatisConf;

public class MyBatisTestByDao {

	public static void main(String[] args) {
		String id = "888";
		String name = "马";
		
		getMskTestListMap(name);
		
		/*
		System.out.println("------数据查询------");
		getMskTestByIdMap(id);
		*/
		
		/*
		System.out.println("------数据插入------");
		insertMskTest(id);
		getMskTestbyId(id);
		*/
		
		/*
		System.out.println("------数据查询------");
		getMskTestlist(id);
		*/
		
		/*
		System.out.println("------数据更新------");
		updateMskTest(id);
		getMskTestbyId(id);
		*/
		
		/*
		System.out.println("------数据删除------");
		deleteMskTest(id);
		getMskTestbyId(id);
		*/
	}
	
	/**
	 * 简单MyBatis读取数据
	 */
	private static void getMskTestbyId(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			
			MskTest mskTest = mskTestMapper.getMskTestById(id);
			
			mskTest.show();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * 简单MyBatis读取数据
	 */
	private static void getMskTestlist(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			
			List<MskTest> mskTestList = mskTestMapper.getMskTestList(id);
			
			for(MskTest mskTest : mskTestList) {
				mskTest.show();
				System.out.println("=========");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * 简单MyBatis读取数据
	 */
	private static void getMskTestByIdMap(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			
			Map<String, String> mskTestMap = mskTestMapper.getMskTestByIdMap(id);
			
			System.out.println(mskTestMap);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * 简单MyBatis读取数据
	 */
	private static void getMskTestListMap(String name) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			
			Map<String, Object> mskTestMap = mskTestMapper.getMskTestListMap(name);
			
			for(Map.Entry<String, Object> entry : mskTestMap.entrySet()) {
				System.out.println(entry.getKey());
				((MskTest)entry.getValue()).show();
				System.out.println("=========");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * 简单MyBatisc插入数据
	 */
	private static void insertMskTest(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			MskTest mskTest = new MskTest();
			mskTest.setId(id);
			mskTest.setName("马士凯");;
			mskTest.setAddr("辽宁沈阳浑南");;
			mskTest.setEmail("mskkingtake@vip.163.com");
			mskTest.setTel("13555855555");
			
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			mskTestMapper.addMskTest(mskTest);
			
			System.out.println("插入成功");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * 简单MyBatisc修改数据
	 * @param id
	 */
	private static void updateMskTest(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			MskTest mskTest = new MskTest();
			mskTest.setId(id);
			mskTest.setName("马士凯");;
			mskTest.setAddr("辽宁沈阳浑南");;
			mskTest.setEmail("mskkingtake@vip.163.com");
			mskTest.setTel("13134230000");
			
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			mskTestMapper.updateMskTest(mskTest);
			
			System.out.println("修改成功");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * 简单MyBatisc删除数据
	 * @param id
	 */
	private static void deleteMskTest(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			MskTest mskTest = new MskTest();
			mskTest.setId(id);
			mskTest.setName("马士凯");;
			mskTest.setAddr("辽宁沈阳浑南");;
			mskTest.setEmail("mskkingtake@vip.163.com");
			mskTest.setTel("13555855555");
			
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			mskTestMapper.deleteMskTest(mskTest);
			
			System.out.println("插入成功");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
