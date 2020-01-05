package cn.pad.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 执行数据库操作的工具类。
 * 
 * @author
 */
public class BaseDao {

	protected Connection conn;
    
    protected PreparedStatement pstmt;
    
    public BaseDao(Connection conn) {
        this.conn = conn;
    }
    
    /**
     * 增、删、改操作
     * 
     * @param sql
     *            sql语句
     * @param prams
     *            参数数组
     * @return 执行结果
     * @throws SQLException 
     */
    protected int executeUpdate(String sql, Object... params) throws SQLException {
        int result = 0;
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }

    /**
     * 查询操作
     * 
     * @param sql
     *            sql语句
     * @param params
     *            参数数组
     * @return 查询结果集
     * @throws SQLException 
     */
    protected ResultSet executeQuery(String sql, Object... params) throws SQLException {
        pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return rs;
    }
    
  //释放资源
  	public boolean closeResource(){
  		if(pstmt != null){
  			try {
  				pstmt.close();
  			} catch (SQLException e) {
  				e.printStackTrace();
  				return false;
  			}
  		}
  		return true;
  	}
  	//释放ResultSet资源
  	public boolean closeResource(ResultSet reSet){
  		if(reSet != null){
  			try {
  				reSet.close();
  			} catch (SQLException e) {
  				e.printStackTrace();
  				return false;
  			}
  		}
  		return true;
  	}
}
