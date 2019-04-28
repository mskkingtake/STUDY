package mskkingtake.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConf {
	private static SqlSessionFactory SQL_SESSION_FACTOR = null;
	
	/**
	 * ��ȡSqlSessionFactory
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		try {
			if(SQL_SESSION_FACTOR == null) {
				// ʹ�������ļ�
				// String resource = "myBatis/myBatis-conf.xml";
				
				// ʹ��properties�����ļ�
//				 String resource = "myBatis/myBatis-properties-conf.xml";
				
				// ʹ��properties�����ļ�
				String resource = "myBatis/myBatis-env-conf.xml";
				
				InputStream inputStream = Resources.getResourceAsStream(resource);
				SQL_SESSION_FACTOR = new SqlSessionFactoryBuilder().build(inputStream, "mskkingtake");
			}
			
			return SQL_SESSION_FACTOR; 
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
