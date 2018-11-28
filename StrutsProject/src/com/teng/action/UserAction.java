package com.teng.action;

import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.teng.bean.User;
import com.teng.dao.UserDao;
import com.teng.factory.Factory;

public class UserAction extends ActionSupport{
		private User user;
		private String name;
		private String password;
		private List<User> list;
		private String key;
		private String value;
		
		/**
		 * 增加一个数据
		 * @return
		 * @throws Exception
		 */
		public String add() throws Exception{
			UserDao userDao=Factory.getUserDaoImpl();
			int i=userDao.save(user);
			if(i>0){
				return "add";
			}else{
				return "error";
			}
		}
		/**
		 * 删除一个数据
		 * @return
		 * @throws Exception
		 */
		public String delete() throws Exception{
			UserDao userDao=Factory.getUserDaoImpl();
			int i=userDao.delete(this.getName());
			if(i>0){
				return "delete";
			}else{
				return "error";
			}
		}
		/**
		 * 根据用户名查找一条数据
		 * @return
		 * @throws Exception
		 */
		public String findOne() throws Exception{
			UserDao userDao=Factory.getUserDaoImpl();
			this.setUser(userDao.findOne(this.getName()));
			if(this.getUser()!=null){
				return "findOne";
			}else{
				return "error";
			}
		}
		/**
		 * 修改用户信息
		 * @return
		 * @throws Exception
		 */
		public String update() throws Exception{
			UserDao userDao=Factory.getUserDaoImpl();
			int i=userDao.update(this.getUser(),this.getName());
			if(i>0){
				return "update";
			}else{
				return "error";
			}
		}
		/**
		 * 查找所有数据
		 * @return
		 * @throws Exception
		 */
		public String findAll() throws Exception{
			UserDao userDao=Factory.getUserDaoImpl();
			this.setList(userDao.findAll());
			if(this.getList()!=null&& !this.getList().isEmpty()){
				return "findAll";
			}else{
				return "error";
			}
		}
		/**
		 * 通过key,value来判断需查找的数据
		 * @return
		 * @throws Exception
		 */
		public String search() throws Exception{
			UserDao userDao=Factory.getUserDaoImpl();
			this.setList(userDao.findClass(this.getKey(), this.getValue()));
			if(this.getList()!=null&& !this.getList().isEmpty()){
				return "search";
			}else{
				return "error";
			}
		}
		/**
		 * 登录验证
		 * @return
		 * @throws Exception
		 */
		public String login() throws Exception{
			UserDao userDao=Factory.getUserDaoImpl();
			this.setUser(userDao.login(this.getName(), this.getPassword()));
			if(user.getName()!=null){
				return "login";
			}else{
				return "loginerror";
			}
			
		}
		
		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public List<User> getList() {
			return list;
		}

		public void setList(List<User> list) {
			this.list = list;
		}
		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

}
