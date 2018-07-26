<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
td {
	border-right: 1px solid #C1DAD7;
	border-bottom: 1px solid #C1DAD7;
	background: #fff; 
	font-size: 11px;
	padding: 6px 6px 6px 12px;
	color: #4f6b72;
	text-align: center;
	
}

body {
    filter:alpha(opacity=20);  //背景图片设置为透明
    text-align: center;
	background-image: url(img/4.jpg);
	background-position: center;
	background-repeat: repeat-y；
	
	
}
table{
margin:0 auto; 
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简历页面</title>
</head>
<body>
	<table id="mytable" cellspacing="0">
		
		<tr><!--第一行-->
			<td class="row" colspan="4">简历</td>
		</tr>
		<tr><!--第二行-->
			<td class="row">ID</td>
			<td class="row"><input></td>
			<td class="row">最后修改时间</td>
			<td class="row"><input></td>
		</tr>
		<tr><!--第三行-->
			<td class="row">姓名</td>
			<td class="row"></td>
			<td class="row">自我简介</td>
			<td class="row"></td>
		</tr>
		<tr><!--第四行-->
			<td class="row">联系电话</td>
			<td class="row"></td>
			<td class="row">学历</td>
			<td class="row"></td>
		</tr>
		<tr><!--第五行-->
			<td class="row">专业</td>
			<td class="row"></td>
			<td class="row">毕业院校</td>
			<td class="row"></td>
		</tr>
		<tr><!--第六行-->
			<td class="row">外语</td>
			<td class="row"></td>
			<td class="row">现居地</td>
			<td class="row"></td>
		</tr>
		<tr><!--第七行-->
			<td class="row">身份证号码</td>
			<td class="row"></td>
			<td class="row">性别</td>
			<td class="row"></td>
		</tr>
		<tr><!--第八行-->
			<td class="row">生日</td>
			<td class="row"></td>
			<td class="row">籍贯</td>
			<td class="row"></td>
		</tr>
		<tr><!--第九行-->
			<td class="row">学习工作经历</td>
			<td class="row"></td>
			<td class="row">工作成就与获奖情况</td>
			<td class="row"></td>
		</tr>		
	</table>
</body>
</html>