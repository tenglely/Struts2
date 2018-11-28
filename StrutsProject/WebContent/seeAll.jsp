<%@page import="com.teng.bean.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
   <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
   <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
    <div class="navbar-header">
        <a class="navbar-brand" href="#">查找方式</a>
    </div>
    <div>
        <form action="search" class="navbar-form navbar-left" role="search" method="post">
	<div id="search">	
		<select name="key" class="form-control">
			<option value="name">用户名</option>
			<option value="userclass">用户类型</option>
			<option value="hobby">爱好</option>
			<option value="sex">性别</option>
		</select>
		<input type="text" name="value" id="keyword" value="" class="form-control" placeholder="关键字">
		<input type="submit" value="查询" class="btn btn-default">
		<a href="main.jsp" target="show" class="btn btn-default navbar-btn">添加用户信息</a>
	</div>
		</form>
    </div>
	</div>
</nav>
		<table class="table table-striped">
		  <thead>
			<tr>
				<td>用户名</td><td>用户类型</td><td>性别</td><td>兴趣爱好</td><td>电子邮件</td><td>自我介绍</td><td>出生日期</td><td>操作</td>
			</tr>
		  </thead>
		  <tbody>
		    <s:iterator value="list">
				<tr>
				<td><s:property value="name"/></td>
				<td><s:property value="userclass"/></td>
				<td><s:property value="sex"/></td>
				<td><s:property value="hobby"/></td>
				<td><s:property value="email"/></td>
				<td><s:property value="other"/></td>
				<td><s:property value="date"/></td>
				<td>
					<a href="delete?name=${name }">删除</a>&nbsp;
					<a href="findOne?name=${name}">修改</a>
				</td>
				</tr>	
            </s:iterator>
		  </tbody>
		</table>	
</body>
</html>