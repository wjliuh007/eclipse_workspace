<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
.addform {
	background:#EEE;
	box-shadow:0px 0px 0px #616161;
	width: 976px;
	height: 320px;
	
	margin: 50px auto;
}

.addform .mName {
	height: 50px;
}
.addform .mName .code{
	width:250px;
	float:left;
	margin: 10px 0 0 8px;
}
.addform .mName .name{
	width:250px;
	float:left;
	margin: 10px 0 0 80px;
}
.addform .mName .enable{
	float:right;
	margin: 10px 200px 0 8px;
}
.addform .description {
	height: 150px;
	
}
.addform .description label{
	
	margin:0 0 0 8px;
}
.addform .description textarea{
	resize:none;
}
.addform .description .descontent{
	height:120px;
	margin: 5px 200px 0 8px;
	
}
.addform .appendix {
	height: 80px;
}
.addform .btn{
	width:350px;
	float:left;
	margin: 2px 0 0 660px;
}
.addform .appendix .time{
	width: 720px;
	height: 30px;
	margin: 5px 0 0 8px;
	
}
.addform .appendix .upload{
	width:475px;
	height: 30px;
	margin: 10px 0 0 8px;
	
}

</style>
<link href="../css/jquery-ui-1.7.3.custom.css" rel="stylesheet" type="text/css"/>
<script src="../js/jquery-1.3.2.min.js"></script>
<script src="../js/ui.datepicker.js"></script>
<script src="../js/zn_datepicker.js"></script>
<script>
  $(function() {
		
		$("#createtime").datepicker({
				showHms:true,/*是否显示时分秒*/
				changeMonth: true,
				changeYear: true,
				dateFormat:'yy-mm-dd',
				buttonImageOnly: true,
				showOn: 'both',
				showButtonPanel:true // must 
		
		});
		$("#updatetime").datepicker({
			showHms:true,/*是否显示时分秒*/
			changeMonth: true,
			changeYear: true,
			dateFormat:'yy-mm-dd',
			buttonImageOnly: true,
			showOn: 'both',
			showButtonPanel:true // must 
	
	});
	});

  </script>
</head>
<body>
	<form:form class="addform" method="POST" action="saveMethod.do" commandName="form">
		<div class="mName">
			<div class="code">
			<label>编码:</label>
			<input id="" name="methodCode" type="text" maxlength="30"/>
			</div>
			<div class="name">
			<label>名称:</label>
			<input id="" name="methodName" type="text" maxlength="50"/>
			</div>
			<div class="enable">
			<label>可用否:</label>
			<input id="" name="isdelete" type="checkbox"/>
			</div>
		</div>
		<div class="description">
			<label>描述:</label>
			<div class="descontent">
				<textarea name="description" rows="5" cols="80" ></textarea>
			</div>
		</div>
		<div class="appendix">
			<div class="time">
				<label>创建时间:</label><input id="createtime" name="createtime" type="text"/>
				<label>更新时间:</label><input id="updatetime" name="updatetime" type="text"/>
			</div>
			<div class="upload">
				<label>附件:</label><input name="appendix" type="file">
			</div>
		</div>
		<div class="btn">
			<input type="submit" value="保存"/>
		</div>		
	</form:form>
</body>
</html>