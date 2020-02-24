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
<link type="text/css" rel="stylesheet" href="../css/hallo.css" />

<jsp:useBean id="lb" class="de.hwg_lu.bw4s.beans.LoginBean" scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bw4s.beans.MessageBean" scope="session" />
<jsp:useBean id="gb" class="de.hwg_lu.bw4s.beans.GUIBean" scope="session" />

<jsp:getProperty name="gb" property="htmlHeadline" />
<jsp:getProperty name="mb" property="htmlMessage" />


<body>
<div class="login-box"></div>






<form action="./LoginAppl.jsp" method="get">

<div class="login-box">

  <h1>Login</h1>
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text" name="userid" placeholder="Username" value='<jsp:getProperty name="lb" property="userid" />' >
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" name="password" placeholder="Passwort"value="">
  </div>

  <input type="submit" class="btn" name="login" value="Anmelden">
  
 
  Noch kein Account? Klicken Sie <a href="./LoginAppl.jsp?zurReg=zurReg" href="../css/hallo.css">hier</a>.
</div>


</form>
</body>
</html>