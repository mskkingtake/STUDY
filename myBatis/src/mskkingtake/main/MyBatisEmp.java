package mskkingtake.main;


import java.sql.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mskkingtake.Dao.EmpMapper;
import mskkingtake.bean.Emp;
import mskkingtake.util.MyBatisConf;

public class MyBatisEmp {

	public static void main(String[] args) {
//		getEmpById(7);
		addEmp();
//		modEmp(30);
//		delEmp(30);
	}
		
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ����Ϣ
	 */
	private static void getEmpById(Integer id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
			Emp emp = empMapper.getEmpById(id);
			emp.show();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ����Ա����Ϣ
	 */
	private static void addEmp() {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			Emp emp = new Emp();
			emp.setId(30);
			emp.setName("��ʿΡΡ");
			emp.setSex("1");
			emp.setEmail("mskkingtake@163.com");
			emp.setAddr("shenayng");
			emp.setDept("02");
			emp.setCost(11000);
			emp.setMark("no mark");
			emp.setUpdDate(new Date(0));
			
			EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
			Integer count = empMapper.addEmp(emp);
			System.out.println("����������" + count + "��");
			System.out.println("����ID:" + emp.getId());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * �޸�Ա����Ϣ
	 */
	private static void modEmp(Integer id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			Emp emp = new Emp();
			emp.setId(id);
			emp.setName("��ʿΡΡ-NAME");
			emp.setSex("1");
			emp.setEmail("mskkingtake@163.com");
			emp.setAddr("shenayng");
			emp.setDept("02");
			emp.setCost(11000);
			emp.setMark("no mark");
			emp.setUpdDate(new Date(0));
			
			EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
			Integer count = empMapper.modEmp(emp);
			System.out.print("�����޸���" + count + "��");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ɾ��Ա����Ϣ
	 */
	private static void delEmp(Integer id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
			Integer count = empMapper.delEmp(id);
			System.out.print("����ɾ����" + count + "��");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
}
