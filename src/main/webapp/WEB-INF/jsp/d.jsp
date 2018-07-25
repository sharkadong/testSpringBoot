<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<style type="text/css">
body{
            background-image:url(img/4.jpg);
            background-position:center;           
             background-repeat:repeat-y；
        }
.a{
margin-left: 200px;
margin-top: 320px;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
<div class="a">
<form class="form-inline" action="b">

  <div class="form-group">
    <label class="sr-only" for="exampleInputEmail3">用户名</label>
    <input type="text" class="form-control" id="exampleInputEmail3" placeholder="用户名">
  </div><br /><br />
  <div class="form-group">
    <label class="sr-only" for="exampleInputPassword3">密码</label>
    <input type="password" class="form-control" id="exampleInputPassword3" placeholder="密码">
  </div><br /><br />
  <div class="form-group">
    <label class="sr-only" for="exampleInputPassword3">密码</label>
    <input type="password" class="form-control" id="exampleInputPassword3" placeholder="确认密码">
  </div><br /><br />
  <div class="checkbox">
    <label>
      <input type="checkbox"> 记住我
    </label>
  </div><br /><br />
  <button type="submit" class="btn btn-default">注册</button>
  <a class="btn btn-default" href="a" role="button">返回</a>
</form>
</div>
</body>
</html>