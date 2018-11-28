<%@page import="com.teng.bean.User"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="work.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
   <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
   <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
</head>
<body>
	<%
		if(request.getAttribute("user")!=null){
			User user=(User)request.getAttribute("user");	
	%>
	<form action="update?name=<%=user.getName()%>" method="post">
	  <table>
	  <tr>
		<td align="right">用户名：</td>
		<td><br><input type="text" name="user.name" id="txtUser" value="<%=user.getName()%>" class="form-control" onblur="return checkForm()"><br></td>
	 	<td><span id="tips_username">*用户名由6-18位字符组成</span></td>
	  </tr><tr>
	  	<td align="right">性别：</td>
	  	<td><input type="radio" name="user.sex" value="男" <%if(user.getSex().equals("男"))  out.print("checked"); %> >男  
			<input type="radio" name="user.sex" value="女" <%if(user.getSex().equals("女"))  out.print("checked"); %>>女<br></td>
	  	<td><span id="tips_sexs">*请选择你的性别</span></td>
	  </tr>
	  <tr>
		<td align="right">用户类型：</td>
		<td>
		<select name="user.userclass" class="form-control">
			<option value="学生" <%if(user.getUserclass().equals("学生")) out.print("selected='true'"); %>>学生</option>
			<option value="老师" <%if(user.getUserclass().equals("老师")) out.print("selected='true'"); %>>老师</option>
		</select><br>
		</td></tr><tr>
		<td align="right">兴趣爱好：</td><td>
			<input type="checkbox" name="user.hobby"  value="阅读" <% if(user.getHobby().indexOf("阅读")>=0) out.print("checked"); %>>阅读
			<input type="checkbox" name="user.hobby"  value="音乐" <% if(user.getHobby().indexOf("音乐")>=0) out.print("checked"); %>>音乐
			<input type="checkbox" name="user.hobby"  value="运动" <% if(user.getHobby().indexOf("运动")>=0) out.print("checked"); %>>运动
		</td>
		<td><span id="tips_hobby">*请选择兴趣爱好</span></td>
		</tr>
		<tr>
			<td align="right">出生日期：</td>
			<td><input type="date" name="user.date" value="<%=user.getDate()%>" id="date" class="form-control"><br></td>
			<td><span id="tip_date">*请选择你的出生日期，格式为 -年-月-日</span></td>
		</tr>
		<tr>
		<td align="right">邮箱：</td>
		<td><input type="text" name="user.email" value="<%=user.getEmail()%>" id="email" class="form-control" onblur="return checkForm()"><br></td>
		<td><span id="tips_email"> *请输入邮箱</span></td>
		</tr>
		<tr>
		<td align="right">自我介绍：</td>
		<td><textarea rows="6" cols="30" name="user.other" id="textarea" placeholder="......" onblur="return checkForm()"><%=user.getOther() %></textarea></td>
		<td><span id="tips_me">*限100字以内</span><td></td>
		</tr>
		<tr><td colspan="2" align="center"><input type="submit" value="提交" onclick="return change()"></td></tr>
	  </table>
	</form>
	<% } %>
</body>
</html>