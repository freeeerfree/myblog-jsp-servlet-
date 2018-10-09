<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">勒鑫</a>
	</div>
	<div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="/myblog/SortServlet?sort=首页">首页</a></li>
			<li><a href="#">前端</a></li>
			<li><a href="#">后端</a></li>
            <li><a href="#">数据库</a></li>
            <li><a href="#">运维</a></li>
            <li><a href="#">随笔</a></li>
		</ul>
	</div>
	</div>
</nav>
<div class="left_nav" style="width:22%">
<ul class="nav nav-pills nav-stacked">
  <li class="active"><a href="#">Home</a></li>
  <li><a href="#">SVN</a></li>
  <li><a href="#">iOS</a></li>
  <li><a href="#">VB.Net</a></li>
  <li><a href="#">Java</a></li>
  <li><a href="#">PHP</a></li>
</ul>
<div class="left_nav">
<script>
	$(document).ready(function(){
$('nav ul>li').click(function(){
			$('nav ul>li').removeClass("active");
			$('nav ul>li').addClass("active");
		});
alert("a");
});

</script>
</body>
</html>