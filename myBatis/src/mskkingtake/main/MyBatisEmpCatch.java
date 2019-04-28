package mskkingtake.main;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mskkingtake.Dao.EmpMapper;
import mskkingtake.bean.Emp;
import mskkingtake.util.MyBatisConf;

public class MyBatisEmpCatch {

	public static void main(String[] args) {
		for(int i = 0;i < 100; i++) {
			getEmpById(7);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
	
	/**
	 * 简单MyBatis操作
	 * 查询员工信息
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
}
