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
		String name = "��";
		
		getMskTestListMap(name);
		
		/*
		System.out.println("------���ݲ�ѯ------");
		getMskTestByIdMap(id);
		*/
		
		/*
		System.out.println("------���ݲ���------");
		insertMskTest(id);
		getMskTestbyId(id);
		*/
		
		/*
		System.out.println("------���ݲ�ѯ------");
		getMskTestlist(id);
		*/
		
		/*
		System.out.println("------���ݸ���------");
		updateMskTest(id);
		getMskTestbyId(id);
		*/
		
		/*
		System.out.println("------����ɾ��------");
		deleteMskTest(id);
		getMskTestbyId(id);
		*/
	}
	
	/**
	 * ��MyBatis��ȡ����
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
	 * ��MyBatis��ȡ����
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
	 * ��MyBatis��ȡ����
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
	 * ��MyBatis��ȡ����
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
	 * ��MyBatisc��������
	 */
	private static void insertMskTest(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			MskTest mskTest = new MskTest();
			mskTest.setId(id);
			mskTest.setName("��ʿ��");;
			mskTest.setAddr("������������");;
			mskTest.setEmail("mskkingtake@vip.163.com");
			mskTest.setTel("13555855555");
			
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			mskTestMapper.addMskTest(mskTest);
			
			System.out.println("����ɹ�");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatisc�޸�����
	 * @param id
	 */
	private static void updateMskTest(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			MskTest mskTest = new MskTest();
			mskTest.setId(id);
			mskTest.setName("��ʿ��");;
			mskTest.setAddr("������������");;
			mskTest.setEmail("mskkingtake@vip.163.com");
			mskTest.setTel("13134230000");
			
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			mskTestMapper.updateMskTest(mskTest);
			
			System.out.println("�޸ĳɹ�");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatiscɾ������
	 * @param id
	 */
	private static void deleteMskTest(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		try {
			MskTest mskTest = new MskTest();
			mskTest.setId(id);
			mskTest.setName("��ʿ��");;
			mskTest.setAddr("������������");;
			mskTest.setEmail("mskkingtake@vip.163.com");
			mskTest.setTel("13555855555");
			
			MskTestMapper mskTestMapper = sqlSession.getMapper(MskTestMapper.class);
			mskTestMapper.deleteMskTest(mskTest);
			
			System.out.println("����ɹ�");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
