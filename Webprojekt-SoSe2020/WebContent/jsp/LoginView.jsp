<%@page import="de.hwg_lu.bw4s.beans.GUIBean"%>
<%@page import="de.hwg_lu.bw4s.beans.MessageBean"%>
<%@page import="de.hwg_lu.bw4s.beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean" scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean" scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean" scope="session" />

<jsp:getProperty name="gb" property="htmlHeadline" />
<jsp:getProperty name="mb" property="htmlMessage" />



<form action="./LoginAppl.jsp" method="get">
<table>
	<tr>
		<td>Nickname:</td>
		<td><input type="text"
					name="userid" placeholder="Username"
					value='<jsp:getProperty name="lb" property="userid" />' 
			/>
		</td>
	</tr>
	<tr>
		<td>Passwort:</td>
		<td><input type="password" name="password" placeholder="Passwort"value="" /></td>
	</tr>
	<tr>
		<td></td>
		<td>
			<input type="submit" name="login" value="Anmelden" />
		</td>
	</tr>
</table>
Noch kein Account? Klicken Sie <a href="./LoginAppl.jsp?zurReg=zurReg">hier</a>.
</form>
</body>
</html>