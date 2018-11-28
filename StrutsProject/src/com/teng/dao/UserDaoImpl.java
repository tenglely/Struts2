package com.teng.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.teng.util.DbUtil;
import com.teng.bean.User;
import com.teng.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public int save(User user) {
		String sql="insert into user(name,password,sex,hobby,email,other,userclass,date) values(?,?,?,?,?,?,?,?)";
		int result=0;
		try{
		PreparedStatement ps=DbUtil.executePrepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getSex());
		ps.setString(4, user.getHobby());
		ps.setString(5, user.getEmail());
		ps.setString(6, user.getOther());
		ps.setString(7, user.getUserclass());
		ps.setString(8, user.getDate());
		//执行sql语句
		result=ps.executeUpdate();
		ps.close();
		DbUtil.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(String username) {
		String sql="delete from user where name='"+username+"'";
		int i=0;
		i=DbUtil.executeUpdate(sql);
		DbUtil.close();
		return i;
	}


	@Override
	public User findOne(String username) {
		String sql="select * from user where name='"+username+"'";
		ResultSet rs=DbUtil.executeQuery(sql);
		User user=new User();
		try {
			if(rs.next()){
				user.setName(rs.getString("name"));
				user.setOther(rs.getString("other"));
				user.setEmail(rs.getString("email"));
				user.setUserclass(rs.getString("userclass"));
				user.setSex(rs.getString("sex"));
				user.setHobby(rs.getString("hobby"));
				user.setDate(rs.getString("date"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtil.close();
		return user;
	}

	
	@Override
	public List<User> findClass(String key, String value) {
		String sql="select * from user";
		List<User> list=new ArrayList<User>();
		if(value!=null){
			sql="select * from user where "+key+" like'%"+value+"%'";
		}
			ResultSet rs=null;
			rs=DbUtil.executeQuery(sql);
			try {
				while(rs.next()){
					User user=new User();
					user.setName(rs.getString("name"));
					user.setOther(rs.getString("other"));
					user.setEmail(rs.getString("email"));
					user.setUserclass(rs.getString("userclass"));
					user.setSex(rs.getString("sex"));
					user.setHobby(rs.getString("hobby"));
					user.setDate(rs.getString("date"));
					list.add(user);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return list;
	}

	@Override
	public int update(User user, String username) {
		String sql="update user set name=?,sex=?,userclass=?,hobby=?,email=?,other=?,date=? where name='"+username+"'";
		int result=0;
		try{
		PreparedStatement ps=DbUtil.executePrepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getSex());
		ps.setString(3, user.getUserclass());
		ps.setString(4, user.getHobby());
		ps.setString(5, user.getEmail());
		ps.setString(6, user.getOther());
		ps.setString(7, user.getDate());
		//执行sql语句
		result=ps.executeUpdate();
		ps.close();
		DbUtil.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<User> findAll() {
			String sql="select * from user";
			List<User> list=new ArrayList<User>();
			ResultSet rs=null;
			rs=DbUtil.executeQuery(sql);
			try {
				while(rs.next()){
					User user=new User();
					user.setName(rs.getString("name"));
					user.setOther(rs.getString("other"));
					user.setEmail(rs.getString("email"));
					user.setUserclass(rs.getString("userclass"));
					user.setSex(rs.getString("sex"));
					user.setHobby(rs.getString("hobby"));
					user.setDate(rs.getString("date"));
					list.add(user);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return list;
	}

	@Override
	public User login(String username, String password) {
		String sql="select * from user where name='"+username+"' and password='"+password+"'";
		ResultSet rs=DbUtil.executeQuery(sql);
		User user=new User();
		try {
			if(rs.next()){
				user.setName(rs.getString("name"));
				user.setOther(rs.getString("other"));
				user.setEmail(rs.getString("email"));
				user.setUserclass(rs.getString("userclass"));
				user.setSex(rs.getString("sex"));
				user.setHobby(rs.getString("hobby"));
				user.setDate(rs.getString("date"));		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtil.close();
		return user;
	}

	

}
