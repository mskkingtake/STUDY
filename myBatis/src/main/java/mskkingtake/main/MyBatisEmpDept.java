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
	 * 简单MyBatis操作
	 * 查询员工部门信息
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
	 * 简单MyBatis操作
	 * 查询员工部门信息
	 * association级联查询
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
	 * 简单MyBatis操作
	 * 查询员工部门信息
	 * association级联查询
	 * 延迟加载
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
	 * 简单MyBatis操作
	 * 查询员工部门信息
	 * association级联查询
	 * 延迟加载
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
