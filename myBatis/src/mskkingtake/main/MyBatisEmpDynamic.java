package mskkingtake.main;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mskkingtake.Dao.EmpDynamicMapper;
import mskkingtake.bean.Emp;
import mskkingtake.util.MyBatisConf;

public class MyBatisEmpDynamic {

	public static void main(String[] args) {
//		getEmpIf();
//		getEmpChoose();
//		modEmpSet();
//		getEmpForeach();
		addEmpForeach();
	}
		
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ����Ϣ
	 * IF��̬SQL
	 */
	private static void getEmpIf() {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			Emp empInput = new Emp();
			empInput.setId(null);
			empInput.setName("��");
			empInput.setSex("2");
			
			EmpDynamicMapper empDynamicMapper = sqlSession.getMapper(EmpDynamicMapper.class);
			List<Emp> empList = empDynamicMapper.getEmpIf(empInput);
			
			for(Emp emp : empList) {
				emp.show();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ����Ϣ
	 * CHOOSE��̬SQL
	 */
	private static void getEmpChoose() {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			Emp empInput = new Emp();
			empInput.setId(99);
			empInput.setName("��");
			empInput.setSex("2");
			
			EmpDynamicMapper empDynamicMapper = sqlSession.getMapper(EmpDynamicMapper.class);
			List<Emp> empList = empDynamicMapper.getEmpChoose(empInput);
			
			for(Emp emp : empList) {
				emp.show();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ����Ϣ
	 * SET��̬SQL
	 */
	private static void modEmpSet() {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			Emp emp = new Emp();
			emp.setId(115);
//			emp.setName("��ʿΡΡ-haha");
			emp.setSex("1");
			emp.setEmail("mskkingtake@163.com");
			emp.setAddr("shenayng");
			emp.setDept("02");
			emp.setCost(11000);
			emp.setMark("no mark");
			emp.setUpdDate(new Date(System.currentTimeMillis()));
			
			EmpDynamicMapper empDynamicMapper = sqlSession.getMapper(EmpDynamicMapper.class);
			Integer returnCount = empDynamicMapper.modEmpSet(emp);
			
			System.out.println(returnCount);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ����Ϣ
	 * CHOOSE��̬SQL
	 */
	private static void getEmpForeach() {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			Emp empInput = new Emp();
			empInput.setId(99);
			empInput.setName("��");
			empInput.setSex("2");
			
			EmpDynamicMapper empDynamicMapper = sqlSession.getMapper(EmpDynamicMapper.class);
			List<Emp> empList = empDynamicMapper.getEmpForeach(Arrays.asList(1,2,3,4,5));
			
			for(Emp emp : empList) {
				emp.show();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ��������Ա����Ϣ
	 * FOEEACH��̬SQL
	 */
	private static void addEmpForeach() {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			List<Emp> empList = new ArrayList<Emp>();
			for(int i = 100;i < 109; i++) {
				Emp emp = new Emp();
				emp.setName("��ʿΡΡ-" + i);
				emp.setSex(i%2 == 0?"1":"2");
				emp.setEmail("mskkingtake@163.com");
				emp.setAddr("��������");
				emp.setDept(i%2 == 0?"01":"02");
				emp.setCost(11000);
				emp.setMark("no mark");
				emp.setUpdDate(new Date(System.currentTimeMillis()));
				
				empList.add(emp);
			}
			
			EmpDynamicMapper empDynamicMapper = sqlSession.getMapper(EmpDynamicMapper.class);
			Integer returnCount = empDynamicMapper.addEmpForeach(empList);
			
			System.out.println(returnCount);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
}
