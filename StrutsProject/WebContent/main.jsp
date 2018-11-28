<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="work.js">
</script>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
   <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script></head>

</head>
<body>
	<form action="add" method="post">
	<table>
		<tr>
			<td align="right">用户名：</td>
			<td><br><input type="text" name="user.name" id="txtUser" onblur="return checkForm()" class="form-control" ><br></td>
			<td><span id="tips_username">*用户名由6-18位字符组成</span></td>
		</tr>
		<tr>
			<td align="right">密    码：</td>
			<td><input type="password" name="user.password" id="txtPsw" onblur="return checkForm()" class="form-control"><br></td>
			<td><span id="tips_psw">*密码由6-18位字符组成，且必须包含字母，数字和标点符号</span></td>
		</tr>
		<tr>
			<td align="right">确认密码：</td>
			<td><input type="password" name="repsw" id="txtRepsw" onblur="return checkForm()" class="form-control"><br></td>
			<td><span id="tips_repsw">*请再次输入密码</span></td>
		</tr>
		<tr>
			<td align="right">用户类型：</td>
			<td>
			<select name="user.userclass" id="userclass" class="form-control">
				<option value="学生">学生</option>
				<option value="老师">老师</option>
			</select><br>
			</td>
		</tr>
		<tr>
			<td align="right">性别：</td>
			<td><input type="radio" name="user.sex" value="男" id="sex" checked="checked">男  
			<input type="radio" name="user.sex" value="女" id="sex">女<br></td>
			<td><span id="tips_sexs">*请选择你的性别</span></td>
		</tr>
		<tr>
			<td align="right">出生日期：</td>
			<td><input type="date" name="user.date" id="date" class="form-control" value="年/月/日" ><br></td>
			<td><span id="tip_date">*请选择你的出生日期，格式为 -年-月-日</span></td>
		</tr> 
		<tr>
			<td align="right">兴趣爱好:</td>
			<td>
			<input type="checkbox" name="user.hobby" id="hobby" value="阅读" >阅读
			<input type="checkbox" name="user.hobby" id="hobby" value="音乐">音乐
			<input type="checkbox" name="user.hobby" id="hobby" value="运动">运动<br>
			</td>
			<td><span id="tips_hobby">*请选择兴趣爱好</span></td>
		</tr>
		<tr>
			<td align="right">电子邮件：</td>
			<td><input type="text" name="user.email" id="email"  onblur="return checkForm()" class="form-control" ><br></td>
			<td><span id="tips_email"> *请输入邮箱</span></td>
		</tr>
		<tr>
			<td align="right">自我介绍：</td>
			<td><textarea rows="6" cols="30" name="user.other" id="textarea"  onblur="return checkForm()" placeholder="......"></textarea></td>
			<td><span id="tips_me">*限100字以内</span><td></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><br><input type="submit" value="提交" onclick="return change()" class="btn btn-default"></td>
		</tr>
	</table>
	</form>
</body>
</html>