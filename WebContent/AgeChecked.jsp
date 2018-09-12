<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html lang="ja">
<body>
	<h1>値の検証</h1>
	あなたの年齢は
	<bean:write name="CheckAgeForm" property="age" />
	です。
</body>
</html:html>