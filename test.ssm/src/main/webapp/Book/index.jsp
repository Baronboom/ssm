<%@page import="model.Type"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	function del(id) {
		if(confirm("是否删除？")) {
			open("delete.action?id="+id,"_self")
		}
	}
</script>

<body>

	<form action="index.action">
		<input name="txt"> <input type="submit" value="查询">
	</form>
	
	<a href="add.action">新增</a> 
	
	<table>
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>性别</td>
			<td>分类</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}"  var="row" varStatus="v">
			<tr>
				<td>${v.index}</td>
				<td>${row.name}</td>
				<td>${row.sexname}</td>
				<td>${row.typename}</td>
				<td><a href="javascript:del(${row.id})">删除</a>
				<a href="edit.action?id=${row.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>