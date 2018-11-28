package com.teng.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	/**
	 * 声明数据库信息
	 */
	private static final String url="jdbc:MySQL://localhost:3306/homework?serverTimezone=UTC";
	private static final String user="root";
	private static final String password="123456";
	/**
	 * 声明JDBC的相关对象
	 */
	protected static Statement s=null;
	protected static ResultSet rs=null;
	protected static Connection conn=null;
	/**
	 * 创建数据库连接
	 * @return
	 * @throws ClassNotFoundException 
	 */
	public static synchronized Connection getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 执行update,delete,insert
	 * @param sql
	 * @return
	 */
	public static int executeUpdate(String sql){
		int result=0;
		try {
			s=getConnection().createStatement();
			result=s.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * 执行select语句
	 * @param sql
	 * @return
	 */
	public static ResultSet executeQuery(String sql){
		try {
			s=getConnection().createStatement();
			rs=s.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * 执行动态sql语句
	 * @param sql
	 * @return
	 */
	public static PreparedStatement executePrepareStatement(String sql){
		PreparedStatement ps=null;
		try {
			ps=getConnection().prepareStatement(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
	}
	/**
	 * 事务回滚
	 */
	public static void rollback(){
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 关闭数据库连接对象
	 */
	public static void close(){
		try {
			if(rs!=null)
				rs.close();
			if(s!=null)
				s.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}

