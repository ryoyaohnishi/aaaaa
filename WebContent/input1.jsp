<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html lang="ja">
<body>
	<h1>値の検証</h1>
	年齢を入力してください(0以上200以下の整数)
	<html:form action="/CheckAge" >
		年齢<html:text property="age" />
		<!-- html:errorsタグの利用　 -->
		<html:errors property="age" />
		<html:submit value="報告" />
	</html:form>
</body>
</html:html>