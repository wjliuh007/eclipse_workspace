<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>网页音乐播放器</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
   .musicbox {
			width:600px;
			height:auto;
			margin:6px 4px 0px 0px;
			border:1px solid #9CDD75;
			background-color:#9acd32; /*导航栏下拉背景颜色*/
			color:rgb(100, 100, 100); /*鼠标进入颜色*/
			padding:6px 0px 0px 0px;
			cursor:hand;
			overflow-y:hidden; /*导航栏下拉框隐藏*/
			filter:Alpha(opacity = 80);
			-moz-opacity:0.7;
	}
   .musicbox audio{
   			float:center;
	}
</style>

</head>
<body>
	<div class="musicbox">
		<audio class="player" controls="controls"
			src="http://luoo.800edu.net/low/luoo/radio665/08.mp3" />
		<p>
			<a href="#">播放</a> <a href="#">暂停</a>
		</p>
		<ul>
			<li>1</li>
			<li>2</li>
			<li>3</li>
			<li>4</li>
			<li>6</li>
		</ul>
	</div>
</body>
</html>