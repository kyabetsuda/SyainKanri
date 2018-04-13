<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 + Ibatis</title>
<script type="text/javascript">
	function reg(){
		location.href='http://localhost:8080/SyainKanri/getmaxno.action';
	}
</script>
</head>
<body>
<center>
	<h3>社員情報登録</h3>
	<input type="button" value="社員情報登録" onclick="reg()">
<table border="1" bordercolor="orange" cellpadding="0" cellspacing="0" width="750">
		<tr>
			<td>社員コード</td>
			<td>名前（漢字）</td>
			<td>名前（カナ）</td>
			<td>性別</td>
			<td>生年月日</td>
			<td>入社日</td>
			<td>郵便番号</td>
			<td>現住所1</td>
			<td>現住所2</td>
			<td>電話番号</td>
			<td>情報修正</td>
		</tr>

		<s:iterator value="syains">
			<tr>
				<td><s:property value="s_idx"/></td>
				<td><s:property value="s_name1"/></td>
				<td><s:property value="s_name2"/></td>
				<td><s:property value="sex"/></td>
				<td><s:property value="ymd"/></td>
				<td><s:property value="nyusya_ymd"/></td>
				<td><s:property value="zipcode"/></td>
				<td><s:property value="addr1"/></td>
				<td><s:property value="addr2"/></td>
				<td><s:property value="bango"/></td>
				
				<td align="center">
					<a href="http://localhost:8080/SyainKanri/updateform.action?s_idx=${ s_idx }">修正</a>
					<a href="http://localhost:8080/SyainKanri/delete.action?s_idx=${ s_idx }">削除</a>
				</td>
			</tr>
		</s:iterator>
</table>
</center>
</body>
</html>