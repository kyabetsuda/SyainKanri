<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社員情報登録</title>
<script type="text/javascript">
	function insert(){
		var f=document.frm;
		f.submit();
	}
	function list(){
		location.href='http://localhost:8080/SyainKanri/index.jsp';
	}
</script>
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
</head>
<body>
<center>
<h3>社員情報修正</h3>
<form method="post" action="http://localhost:8080/SyainKanri/update.action">
	<table>
		<tr>
			<td>社員コード</td>
			<td>
				<input type="text" name="s_idx" value="<s:property value="s_idx"/>" readonly>
			</td>
		</tr>
		<tr>
			<td>名前（漢字）</td>
			<td>
				<input type="text" value="<s:property value="s_name1"/>" name="s_name1">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple"><s:param value="%{'s_name1'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>名前（カナ）</td>
			<td>
				<input type="text" value="<s:property value="s_name2"/>" name="s_name2">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'s_name2'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>性別</td>
			<td>
				<input type="text" value="<s:property value="sex"/>" name="sex">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'sex'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>生年月日</td>
			<td>
				<input type="text" value="<s:property value="ymd"/>" name="ymd">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'ymd'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>入社日</td>
			<td>
				<input type="text" value="<s:property value="nyusya_ymd"/>" name="nyusya_ymd">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'nyusya_ymd'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>郵便番号</td>
			<td>
				<input type="text" value="<s:property value="zipcode"/>" name="zipcode" onKeyUp="AjaxZip3.zip2addr(this,'','addr1','addr2');">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'zipcode'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>現住所１</td>
			<td>
				<input type="text" value="<s:property value="addr1"/>" name="addr1">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'addr1'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>現住所２</td>
			<td>
				<input type="text" value="<s:property value="addr2"/>" name="addr2">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'addr2'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td>電話番号</td>
			<td>
				<input type="text" value="<s:property value="bango"/>" name="bango">
			</td>
		</tr>
		<tr>
			<td><s:fielderror cssStyle="color : #ff0000" theme="simple" ><s:param value="%{'bango'}" /></s:fielderror></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="登録" />
				<a href="http://localhost:8080/SyainKanri/index.jsp"><input type="button" value="取消"/></a>
			</td>
		</tr>
	</table>
</form>
</center>
</body>
</html>