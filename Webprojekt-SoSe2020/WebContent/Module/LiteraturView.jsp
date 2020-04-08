<%@page import="de.hwg_lu.bw4s.beans.LiteraturBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Literatur | lazyNerds</title>
</head>

<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />
<body>
	<jsp:useBean id="fsb" class="de.hwg_lu.bw4s.beans.LiteraturBean"
		scope="session" />
	<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
		scope="session" />
	<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
		scope="session"></jsp:useBean>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>
	<form action="LiteraturAppl.jsp" method="get">
		<div class="backgroundWir">
			<div class="Anfang">
				<h1>
					Literatur
					<%=kb.getModulValue()%></h1>

				<jsp:getProperty name="kb" property="HTMLFromArtikel" />

				<div class="Anfangdiv">

					<input type="submit" name="indenwarenkorb" value="In den Warenkorb"
						class="submitSetting" /> 
						
						
						<input type="submit" name="zurueckza"
						value="Zur Agenda" class="submitSettingPortal">
				</div>
			</div>
			<br>
		</div>
	</form>
	<!-- FOOTER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="startFooterAsHtml" name="sb" />
	</form>
</body>
</html>