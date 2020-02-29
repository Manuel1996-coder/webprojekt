<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean"
	scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean"
	scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean"
	scope="session" />
	<jsp:useBean id="ab" class="de.hwg_lu.bw4s.beans.AccountBean"
		scope="session" />

<form action="./PasswortaendernAppl.jsp" method="get">
<table>

<tr>

<td><h3> Aktuelles Passwort: </h3> </td>
<td> <input type="password" value="" name="aktuellesPassword" id="btn"> </td>

</tr>
<tr>

<td><h3> Neues Passwort: </h3> </td>
<td><input type="password" value="" name="neuespassword" id="btn"> </td>
</tr>

<tr>

<td><h3> Erneut eingeben:
 </h3> </td>
<td><input type="password"value="" name="neuespassword" id="btn"> </td>
</tr>



</table>


<input type="submit"value="Zurück zu Einstellungen" name="zurueckEinstellungen" id="detail">
<input type="submit"value="Änderung speichern" name="speichern" id="detail">
</form>
</body>
</html>