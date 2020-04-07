<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Skript | lazyNerds</title>
</head>
<link type="text/css" rel="stylesheet" href="../css/bewertung.css" />

<jsp:useBean id="kb" class="de.hwg_lu.bw4s.beans.SkriptBean"
	scope="session" />
<jsp:useBean id="nb" class="de.hwg_lu.bw4s.beans.NotizenBean"
	scope="session" />
<jsp:useBean id="sb" class="de.hwg_lu.bw4s.beans.StartseiteBean"
	scope="session"></jsp:useBean>

<body>

	<!-- HEADER -->
	<form action="../jsp/StartseiteAppl.jsp" method="get">
		<jsp:getProperty property="headerAsHtml2" name="sb" />
	</form>
  
  <form action="../Module/SkriptAppl.jsp" method="get">    
	<div class="backgroundWir">
		<h1>Skript</h1>
		<div class="Anfang">

			<div id="part2part">
				<div class="panel panel-test3">
					<div class="Klein">
						<h3>
							<%=kb.getModulValue()%>
						</h3>
						<iframe src="<%=kb.getSkript()%>" width="100%" height="100%"></iframe>
					</div>
				</div>
				<div class="panel panel-test1">
					<div class="Klein">
						<%=nb.getHTMLNotizen2()%>
					</div>
				</div>
			</div>

			<div class="Anfangdiv">

					<input type="submit" name="speichern" value="Speichern"
						class="submitSetting"> <input type="submit"
						name="zurueckza" value="Zur Agenda" class="submitSettingPortal">
		
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