package mskkingtake.main;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mskkingtake.Dao.DeptpartmentMapper;
import mskkingtake.Dao.EmpDeptMapper;
import mskkingtake.bean.DeptpartmentAndEmp;
import mskkingtake.bean.EmpAndDept;
import mskkingtake.bean.EmpDept;
import mskkingtake.util.MyBatisConf;

public class MyBatisEmpDept {

	public static void main(String[] args) {
//		getEmpAndDeptyId(7);
//		getEmpDeptyId(7);
//		getEmpDeptByIdStep(7);
		
		getDeptAndEmpById("02");
	}
		
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ��������Ϣ
	 */
	private static void getEmpAndDeptyId(Integer id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			EmpDeptMapper empDeptMapper = sqlSession.getMapper(EmpDeptMapper.class);
			EmpAndDept empDept = empDeptMapper.getEmpAndDeptById(id);
			empDept.show();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ��������Ϣ
	 * association������ѯ
	 */
	private static void getEmpDeptyId(Integer id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			EmpDeptMapper empDeptMapper = sqlSession.getMapper(EmpDeptMapper.class);
			EmpDept empDept = empDeptMapper.getEmpDeptById(id);
			empDept.show();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ��������Ϣ
	 * association������ѯ
	 * �ӳټ���
	 */
	private static void getEmpDeptByIdStep(Integer id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			EmpDeptMapper empDeptMapper = sqlSession.getMapper(EmpDeptMapper.class);
			EmpDept empDept = empDeptMapper.getEmpDeptByIdStep(id);
			empDept.getDeptpartment();
			empDept.show();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * ��MyBatis����
	 * ��ѯԱ��������Ϣ
	 * association������ѯ
	 * �ӳټ���
	 */
	private static void getDeptAndEmpById(String id) {
		SqlSessionFactory sqlSessionFactory = MyBatisConf.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			DeptpartmentMapper deptpartmentMapper = sqlSession.getMapper(DeptpartmentMapper.class);
			List<DeptpartmentAndEmp> deptpartmentAndEmpList = deptpartmentMapper.getDeptAndEmpById(id);
			for(DeptpartmentAndEmp deptpartmentAndEmp : deptpartmentAndEmpList) {
				deptpartmentAndEmp.show();
				System.out.println("=============================================");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
