package mskkingtake.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConf {
	private static SqlSessionFactory SQL_SESSION_FACTOR = null;
	
	/**
	 * 获取SqlSessionFactory
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		try {
			if(SQL_SESSION_FACTOR == null) {
				// 使用配置文件
				// String resource = "conf/myBatis/myBatis-conf.xml";
				
				// 使用properties配置文件
//				 String resource = "conf/myBatis/myBatis-properties-conf.xml";
				
				// 使用properties配置文件
				String resource = "conf/myBatis/myBatis-env-conf.xml";
				
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
