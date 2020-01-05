  package cn.pad.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * 数据库连接与关闭工具类。
 * 
 */
public class DatabaseUtil {
    
	/**
	 * 获取数据库连接对象。
	 */
	public static Connection getConnection() {
		//初始化上下文
		Context ctx;
		Connection conn=null;
		try {
			ctx = new InitialContext();
			//获取与逻辑名相关联的数据源对象
			DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/shinho");
			conn=ds.getConnection();		
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		return conn;
	}
	
	/**
	 * 关闭数据库连接。
	 * @param conn 数据库连接
	 */
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
