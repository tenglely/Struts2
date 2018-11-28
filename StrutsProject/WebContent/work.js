function checkForm(){
	if(document.getElementById("txtUser").value.length<2||document.getElementById("txtUser").value.length>10){
		document.getElementById("tips_username").innerHTML="<em style='color:#FF0000'>用户名由2-10为字符组成</em>";
		document.getElementById("txtUser").focus();
		return false;
	}else{
		document.getElementById("tips_username").innerHTML="<em style='color:#FF0000'>OK！</em>";
	}
	var reg=/[^A-Za-z0-9_]+/;
	var regs= /^[a-zA-Z0-9_\u4e00-\u9fa5]+$/;
	if(document.getElementById("txtPsw").value.length<6||document.getElementById("txtPsw").value.length>18||regs.test(document.getElementById("txtPsw").value)){
		document.getElementById("tips_psw").innerHTML="<em style='color:#FF0000'>密码由6-18为字符组成，且必须包含字母，数字和标点符号</em>";
		document.getElementById("txtPsw").focus();
		return false;
	}else{
		document.getElementById("tips_psw").innerHTML="<em style='color:#FF0000'>OK！</em>";
	}
	if(document.getElementById("txtRepsw").value!=document.getElementById("txtPsw").value){
		document.getElementById("tips_repsw").innerHTML="<em style='color:#FF0000'>两次输入的密码不相同</em>";
		document.getElementById("txtRepsw").focus();
		return false;
	}else{
		document.getElementById("tips_repsw").innerHTML="<em style='color:#FF0000'>OK！</em>";
	}
	var email=document.getElementById("email").value;
	var pattern=/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/; 
	if(email==""){
		document.getElementById("tips_email").innerHTML="<em style='color:#FF0000'>电子邮箱不能为空</em>";
		document.getElementById("email").focus();
		return false;
	}else if(!pattern.test(email)){
		document.getElementById("tips_email").innerHTML="<em style='color:#FF0000'>电子邮箱不合法</em>";
		document.getElementById("email").focus();
		return false;
	}else{
		document.getElementById("tips_email").innerHTML="<em style='color:#FF0000'>OK！</em>";
	}
	if(document.getElementById("textarea").value.length>100){
		document.getElementById("tips_me").innerHTML="<em style='color:#FF0000'>长度不能超过100个字符</em>";
		document.getElementById("textarea").focus();
		return false;
	}else if(document.getElementById("textarea").value!=""&&document.getElementById("textarea").value!=null){
		document.getElementById("tips_me").innerHTML="<em style='color:#FF0000'>OK！</em>";
	}
}

function change(){
	if(document.getElementById("txtUser").value==""||document.getElementById("txtUser").value==null){
		alert("请填写完整信息");
		document.getElementById("txtUser").focus();
		return false;
	}
	var c=document.getElementById("date").value;
	if(c==""||c==null){
		alert("请填写出生日期");
		document.getElementById("tip_date").innerHTML="<em style='color:#FF0000'>请填入出生日期</em>";
		document.getElementById("date").focus();
		return false;
	}
}